<?php
session_start();
$sessData = !empty($_SESSION['sessData'])?$_SESSION['sessData']:'';
if(!empty($sessData['status']['msg'])){
    $statusMsg = $sessData['status']['msg'];
    $statusMsgType = $sessData['status']['type'];
    unset($_SESSION['sessData']['status']);
}
?>
<!DOCTYPE html>
<html>
<head>
		<link rel="stylesheet" type="text/css" href="css/login.css">
</head> 
<style>
a.logout{float: right; font-size:20px;}
p.success{color:#34A853; font-size:20px;}
p.error{color:#EA4335; font-size:20px;}

</style>
<body> 
		<!-- Duong vien all-->
		<div class = "container-background"> 
			<strong><?php echo !empty($statusMsg)?'<center><p class="'.$statusMsgType.'">'.$statusMsg.'</p></center>':''; ?></strong>
			<form action="userAccount.php" method="post">
				<div class = "IDLogin">
					<img src="images/logo.png"><br>
					<span> Sign in </span>
				</div>		
				<div class = "IDUsername"> 
					<input type="text" name="name" placeholder="Tài khoản" required ="">
				</div>
				<div class = "IDUsername"> 
					<input type="password" name="password" placeholder="Mật khẩu" required ="">
				</div>
				<div class = "IDUsername"> 
					<input type="password" name="confirm_password" placeholder="Nhập lại mật khẩu" required ="">
				</div>
				<div class = "IDUsername"> 
					<input type="text" name="phone" placeholder="Số điện thoại" required="">
				</div>
				<div class = "IDUsername"> 
					<input type="email" name="email" placeholder="E-mail" required="">
				</div>
				
				<div class = "checkbox">
					<input type="checkbox" name=""><span> Đồng ý với các điều khoản và dịch vụ của chúng tôi</span>
				</div>
				<div class = "IDbuttonLogin"> 
					<input type="submit" name="signupSubmit" value="Sign in">
					<a href="index.php"><input type="button" name="" value="Login"></a>
				</div>
			</form>
		</div>
</body>
</html>