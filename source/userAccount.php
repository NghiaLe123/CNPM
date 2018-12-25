<?php
//start session
session_start();
//load and initialize user class
include 'user.php';
$user = new User();
if(isset($_POST['signupSubmit'])){
    //check whether user details are empty
    if(!empty($_POST['name']) && !empty($_POST['email']) && !empty($_POST['phone']) && !empty($_POST['password']) && !empty($_POST['confirm_password'])){
        //password and confirm password comparison
        if($_POST['password'] !== $_POST['confirm_password']){
            $sessData['status']['type'] = 'error';
            $sessData['status']['msg'] = 'Xác nhận mật khẩu không trùng khớp.'; 
        }else{
            //check whether user exists in the database
            $prevCon['where'] = array('email'=>$_POST['email']);
            $prevCon['return_type'] = 'count';
            $prevUser = $user->getRows($prevCon);
            if($prevUser > 0){
                $sessData['status']['type'] = 'error';
                $sessData['status']['msg'] = 'Email đã tồn tại, vui lòng đăng ký với email khác.';
            }else{
                //insert user data in the database
                $userData = array(
                    'name' => $_POST['name'],
                    'email' => $_POST['email'],
                    'phone' => $_POST['phone'],
                    'password' => md5($_POST['password'])
                );
                $insert = $user->insert($userData);
                //set status based on data insert
                if($insert){
                    $sessData['status']['type'] = 'success';
                    $sessData['status']['msg'] = 'Chúc mừng bạn đã đăng ký thành công.';
                }else{
                    $sessData['status']['type'] = 'error';
                    $sessData['status']['msg'] = 'Xảy ra sự cố, vui lòng thử lại.';
                }
            }
        }
    }else{
        $sessData['status']['type'] = 'error';
        $sessData['status']['msg'] = 'Tất cả các trường là bắt buộc, vui lòng điền đầy đủ thông tin vào các trường.'; 
    }
    //store signup status into the session
    $_SESSION['sessData'] = $sessData;
    $redirectURL = ($sessData['status']['type'] == 'success')?'logIn.php':'registration.php';
    //redirect to the home/registration page
    header("Location:".$redirectURL);
}elseif(isset($_POST['loginSubmit'])){
    //check whether login details are empty
    if(!empty($_POST['email']) && !empty($_POST['password'])){
    	 //get user data from user class
        $conditions['where'] = array(
            'email' => $_POST['email'],
            'password' => md5($_POST['password']),
            'status' => '1'
        );
        $conditions['return_type'] = 'single';
        $userData = $user->getRows($conditions);
        //set user data and status based on login credentials
        if($userData){
            $sessData['userLoggedIn'] = TRUE;
            $sessData['userID'] = $userData['id'];
            $sessData['status']['type'] = 'success';
			$_SESSION['getnameuser'] = $userData['name'];
            //$sessData['status']['msg'] = 'Welcome '.$userData['name'].'!';
			//echo '<script type="text/javascript">document.getElementById("login").innerHTML = $userData["name"];</script>';
			//echo '<script type="text/javascript">alert("You have sign in successfully from your account.")</script>';
        }else{
            $sessData['status']['type'] = 'error';
            $sessData['status']['msg'] = 'Email hoặc mật khẩu không chính xác, vui lòng thử lại.';
			//echo '<script type="text/javascript">alert("Wrong email or password, please try again.")</script>';
        }
    }else{
        $sessData['status']['type'] = 'error';
        $sessData['status']['msg'] = 'Vui lòng đăng nhập Email và mật khẩu.'; 
		//echo '<script type="text/javascript">alert("Enter email and password.")</script>';
    }
    //store login status into the session
    //$_SESSION['sessData'] = $sessData;
    //redirect to the home page
	//if($userData['types'] === 'user'){
	$_SESSION['sessData'] = $sessData;
    $redirectURL = ($sessData['status']['type'] == 'success')?'remember.php':'logIn.php';
    //redirect to the home/registration page
    header("Location:".$redirectURL);
	
}elseif(!empty($_REQUEST['logoutSubmit'])){
    //remove session data
    unset($_SESSION['sessData']);
    session_destroy();
    //store logout status into the ession
    $sessData['status']['type'] = 'success';
    $sessData['status']['msg'] = 'Bạn đã đăng xuất thành công khỏi tài khoản của bạn.';
    $_SESSION['sessData'] = $sessData;
    //redirect to the home page
    header("Location:index.php");
}else{
    //redirect to the home page
    header("Location:index.php");
}
?>