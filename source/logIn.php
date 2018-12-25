<?php
if(!isset($_SESSION)){ 
    session_start(); 
} 
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
					<span> Login </span>
				</div>		
				<div class = "IDUsername"> 
					<input type="email" name="email" id="username" placeholder="Email*" required="">
				</div>
				<div class = "IDUsername"> 
					<input type="password" name="password" placeholder="Mật khẩu*" required="">
				</div>
				<div class = "IDforget"> 
					<span><a href=""> Quên mật khẩu </a></span>
				</div>
				<div class = "IDbuttonLogin"> 
					<input type="submit" name="loginSubmit" value="Login">
					<a href="registration.php"><input type="button" name="" value="Sign in"></a>
				</div>
			</form>
		</div>
</body>
</html>