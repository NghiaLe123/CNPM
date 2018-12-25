<?php
if(!isset($_SESSION)){ 
    session_start();
	if($_SESSION['sessData']['status']['type'] == 'success'){
		$getsuccess = $_SESSION['getnameuser'];
	}
	else{
		$getsuccess = "";
	}
	
}
?>
<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8" />

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css" href="css/main.css">

<style>
	body{
		background-color: #ebbd80;
	
	|
</style>
</head>

<script>
$(document).ready(function(){
	
	
	$("#showtuvung").click(function(){
		$("#hoctuvung").toggle();
	});
	
	$("#showtracuu").click(function(){
		$("#tracuu").toggle();
	});
	
	$(".englishlevel").click(function(){
		$("#noidungtuvung").toggle();
	});
	
	
});
</script>

<body>


<nav class="navbar taikhoan">
  <div class="container-fluid">
		<ul class="nav navbar-nav navbar-right" style="margin-top: 12px; ">
			<?php 
				if (isset($getsuccess)){
					echo '<li style="font-size: 20px; color: red;"><strong>'.$getsuccess.'</strong></li>';
					echo '<span style="display: inline-block; font-size: 15px; margin-top: 3px; color: blue; margin-left: 15px;"><a href="userAccount.php?logoutSubmit=1" class="logout">Log out</a></strong></span>';
				}
			?>
		</ul>
  </div>
</nav>

<div class='navb'>

	<div class="row">
	
		<a href='#a' id='showtracuu'><div class="col-md-4">
			<p class='text-center' style='font-size: 23px; padding: 8px; border-right: solid 1px #ccc; margin-top: 8px'> Tra từ điển </p>
		</div></a>
		
		<a href='#b' id='showtuvung'><div class="col-md-4">
			<p class='text-center' style='font-size: 23px; padding: 8px; border-right: solid 1px #ccc; margin-top: 8px'> Học từ vựng </p>
		</div></a>
		
		<a href='#d' id='showtest'><div class="col-md-4">
			<p class='text-center' style='font-size: 23px; padding: 8px; margin-top: 8px'> Làm kiểm tra </p>
		</div></a>
		
	</div>

</div>

<form >
	<input id='tracuu' type='search' class='form-control' placeholder='Search here ...' style='width: 60%; margin-left: 20%; border-radius: 20px;display:none;'>

</form>


<div class='board'>
	
	

</div>

<div class='board well well-adjust' id='hoctuvung'>

	<div style='padding-top: 10px'>
		<h2 class='text-center' style="font-family:'Kaushan Script',cursive,Time,serif;"> Choose your English vocabulary level: </h2>
	</div>
	
	<div class='row'>
	
		<div class='col-md-6'>
		
			<div class='btn btn-default board-ins englishlevel' style='padding-bottom: 8px; width: 80%'>
				<h2 class='text-center' > Beginner </h2>
			</div>
			
			<div class='btn btn-default board-ins englishlevel' style='padding-bottom: 8px; width: 80%'>
				<h2 class='text-center'> Intermediate </h2>
			</div>
			
		</div>
		
		<div class='col-md-6' >
		
			<div class='btn btn-default board-ins englishlevel' style='padding-bottom: 8px; width: 80%'>
				<h2 class='text-center'> Elementary </h2>
			</div>
			
			<div class='btn btn-default board-ins englishlevel' style='padding-bottom: 8px; margin-bottom: 18px; width: 80%'>
				<h2 class='text-center'> Advanced </h2>
			</div>
			
		</div>
		
	</div>

</div>

<div class='board well well-adjust' id='noidungtuvung'>

	<div style='padding-top: 10px'>
		<h2 class='text-center' style="font-family:'Kaushan Script',cursive,Time,serif;"> Choose your lession: </h2>
	</div>
	
	<div class='row'>
	
		<div class='col-md-6'>
		
			<div class='btn btn-default board-ins' style='padding-bottom: 8px; width: 80%'>
				<a href="noidunghoc.html"><h2 class='text-center' > Bài 1: ................ </h2></a>
			</div>
			
			<div class='btn btn-default board-ins' style='padding-bottom: 8px; width: 80%'>
				<a href=""><h2 class='text-center' > Bài 2: ................ </h2></a>
			</div>

			<div class='btn btn-default board-ins' style='padding-bottom: 8px; width: 80%'>
				<a href=""><h2 class='text-center' > Bài 3: ................ </h2></a>
			</div>
			
			<div class='btn btn-default board-ins' style='padding-bottom: 8px; width: 80%'>
				<a href=""><h2 class='text-center' > Bài 4: ................ </h2></a>
			</div>

			<div class='btn btn-default board-ins' style='padding-bottom: 8px; width: 80%'>
				<a href=""><h2 class='text-center' > Bài 5: ................ </h2></a>
			</div>

			
		</div>
		
		<div class='col-md-6'>
		
			<div class='btn btn-default board-ins' style='padding-bottom: 8px; width: 80%'>
				<a href=""><h2 class='text-center' > Bài 6: ................ </h2></a>
			</div>

			<div class='btn btn-default board-ins' style='padding-bottom: 8px; width: 80%'>
				<a href=""><h2 class='text-center' > Bài 7: ................ </h2></a>
			</div>

			<div class='btn btn-default board-ins' style='padding-bottom: 8px; width: 80%'>
				<a href=""><h2 class='text-center' > Bài 8: ................ </h2></a>
			</div>

			<div class='btn btn-default board-ins' style='padding-bottom: 8px; width: 80%'>
				<a href=""><h2 class='text-center' > Bài 9: ................ </h2></a>
			</div>
			
			<div class='btn btn-default board-ins' style='padding-bottom: 8px; margin-bottom: 18px; width: 80%'>
				<a href=""><h2 class='text-center' > Bài 10: ................ </h2></a>
			</div>
			
		</div>
		
	</div>

</div>


</body>

</html>