<!--This is the class used to create the main website.-->
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
<link rel="shortcut icon" href="">

<style>
	body{
		background-color: #ebbd80;
	
	|
</style>
</head>

<script>
$(document).ready(function(){
	$("#noidunghoc").hide();

	$('#showtuvung').click(function(){
			$("#hoctuvung").show();
			$('#tracuu').hide();
			$('#noidungtuvung').hide();

			
	});
	
	$('#showtracuu').click(function(){
			$('#tracuu').show();
			$("#hoctuvung").hide();
			$('#noidungtuvung').hide();


			
	});
	
	$('.englishlevel').click(function(){
			$('#noidungtuvung').show();
			$("#hoctuvung").hide();

			
	});	
	
	$(document).on('click', '#beginner', function(){ //xóa sản phẩm trên giở hàng
			
			$.ajax({
			
				url: 'noidung.php',		
				type: "GET",
				async: false,
				dataType: 'json',
				success: function(data){
	
					for (var i=0; i<data[1].length/2;i++){
						
						$("#left").append("<div class='btn btn-default board-ins left' style='padding-bottom: 8px; width: 80%'> <h2 class='text-center' id='left"+ i +"' >Lession "+ (i+1) +": " +data[1][i] + "</h2> </div> ");

					}
					
					
					for (var i=5; i<data[1].length;i++){	
						$("#right").append("<div class='btn btn-default board-ins' style='padding-bottom: 8px; width: 80%'> <h2 class='text-center'id='left"+ i +"'>Lession "+ (i+1) +": " +data[1][i] + "</h2> </div> ");
					}
					
				},
				error: function(){
					alert("loi");
				}
				
			});
			
		});
		
	$(document).on('click', '#left0', function(){ 
			$.ajax({
			
				url: 'noidung.php',		
				type: "GET",
				async: false,
				dataType: 'json',
				success: function(data){
	
								$("#noidunghoc").html(" <div class='well well-adjust text-center'> <h3 class='lession'> Beginner </h3> </div> <div class='well well-adjust' style='margin'> <div style='padding-top: 10px'> <h2 class='text-center' style='font-family:'Kaushan Script',cursive,Time,serif;'> Lession " + 1 +"(Click the word to listen) </h2> </div> <div style='padding-left: 30px;'> <h1>LESSION WORD: <span class='vocab' id='list1'>" + data[1][0] + "  </span> </h1> <h2> Pronunciation: <span class='pronunciation'>" + data[3][0] +" </span> </h2> <h2> Definition: <span class='definition'>" + data[4][0] +" </span> </h2> <h2 id='listen1'> Example: </h2> <h2 class='example' >" + data[5][0] +" </h2> </div> </div>");
								$("#noidunghoc").show();
								$("#noidungtuvung").hide();
				},
				error: function(){
					alert("loi");
				}
				
			});	
			
					
		});
					
	$(document).on('click', '#left1', function(){ 
		
		$.ajax({
			
			url: 'noidung.php',		
			type: "GET",
			async: false,
			dataType: 'json',
			success: function(data){
	
				$("#noidunghoc").html(" <div class='well well-adjust text-center'> <h3 class='lession'> Beginner </h3> </div> <div class='well well-adjust' style='margin'> <div style='padding-top: 10px'> <h2 class='text-center' style='font-family:'Kaushan Script',cursive,Time,serif;'> Lession " + 2 +"(Click the word to listen) </h2> </div> <div style='padding-left: 30px;'> <h1>LESSION WORD: <span class='vocab' id='list2'>" + data[1][1] + "  </span> </h1> <h2> Pronunciation: <span class='pronunciation'>" + data[3][1] +" </span> </h2> <h2> Definition: <span class='definition'>" + data[4][1] +" </span> </h2> <h2 id='listen1'> Example: </h2> <h2 class='example' >" + data[5][1] +" </h2> </div> </div>");
				$("#noidunghoc").show();
				$("#noidungtuvung").hide();
			},
			error: function(){
				alert("loi");
			}
				
		});	
					
	});	
					
	$(document).on('click', '#left2', function(){ 
			
		$.ajax({
			
			url: 'noidung.php',		
			type: "GET",
			async: false,
			dataType: 'json',
			success: function(data){
	
				$("#noidunghoc").html(" <div class='well well-adjust text-center'> <h3 class='lession'> Beginner </h3> </div> <div class='well well-adjust' style='margin'> <div style='padding-top: 10px'> <h2 class='text-center' style='font-family:'Kaushan Script',cursive,Time,serif;'> Lession " + 3 +"(Click the word to listen) </h2> </div> <div style='padding-left: 30px;'> <h1>LESSION WORD: <span class='vocab' id='list3'>" + data[1][2] + "  </span> </h1> <h2> Pronunciation: <span class='pronunciation'>" + data[3][2] +" </span> </h2> <h2> Definition: <span class='definition'>" + data[4][2] +" </span> </h2> <h2 id='listen1'> Example: </h2> <h2 class='example' >" + data[5][2] +" </h2> </div> </div>");
				$("#noidunghoc").show();
				$("#noidungtuvung").hide();
			},
			error: function(){
				alert("loi");
			}
				
		});	

			
					
	});	
					
	$(document).on('click', '#left3', function(){ 
								
								
		$.ajax({
			
			url: 'noidung.php',		
			type: "GET",
			async: false,
			dataType: 'json',
			success: function(data){
	
				$("#noidunghoc").html(" <div class='well well-adjust text-center'> <h3 class='lession'> Beginner </h3> </div> <div class='well well-adjust' style='margin'> <div style='padding-top: 10px'> <h2 class='text-center' style='font-family:'Kaushan Script',cursive,Time,serif;'> Lession " + 4 +"(Click the word to listen) </h2> </div> <div style='padding-left: 30px;'> <h1>LESSION WORD: <span class='vocab' id='list4'>" + data[1][3] + "  </span> </h1> <h2> Pronunciation: <span class='pronunciation'>" + data[3][3] +" </span> </h2> <h2> Definition: <span class='definition'>" + data[4][3] +" </span> </h2> <h2 id='listen1'> Example: </h2> <h2 class='example' >" + data[5][3] +" </h2> </div> </div>");
				$("#noidunghoc").show();
				$("#noidungtuvung").hide();
			},
			error: function(){
				alert("loi");
			}
				
		});									
								
								
					
	});	
							
	$(document).on('click', '#left4', function(){
		
		$.ajax({
			
			url: 'noidung.php',		
			type: "GET",
			async: false,
			dataType: 'json',
			success: function(data){
	
				$("#noidunghoc").html(" <div class='well well-adjust text-center'> <h3 class='lession'> Beginner </h3> </div> <div class='well well-adjust' style='margin'> <div style='padding-top: 10px'> <h2 class='text-center' style='font-family:'Kaushan Script',cursive,Time,serif;'> Lession " + 5 +"(Click the word to listen) </h2> </div> <div style='padding-left: 30px;'> <h1>LESSION WORD: <span class='vocab' id='list5'>" + data[1][4] + "  </span> </h1> <h2> Pronunciation: <span class='pronunciation'>" + data[3][4] +" </span> </h2> <h2> Definition: <span class='definition'>" + data[4][4] +" </span> </h2> <h2 id='listen1'> Example: </h2> <h2 class='example' >" + data[5][4] +" </h2> </div> </div>");
				$("#noidunghoc").show();
				$("#noidungtuvung").hide();
			},
			error: function(){
				alert("loi");
			}
				
		});					
		
		
								
					
	});	
					
	$(document).on('click', '#left5', function(){ 
	
		$.ajax({
			
			url: 'noidung.php',		
			type: "GET",
			async: false,
			dataType: 'json',
			success: function(data){
	
				$("#noidunghoc").html(" <div class='well well-adjust text-center'> <h3 class='lession'> Beginner </h3> </div> <div class='well well-adjust' style='margin'> <div style='padding-top: 10px'> <h2 class='text-center' style='font-family:'Kaushan Script',cursive,Time,serif;'> Lession " + 6 +"(Click the word to listen) </h2> </div> <div style='padding-left: 30px;'> <h1>LESSION WORD: <span class='vocab' id='list6'>" + data[1][5] + "  </span> </h1> <h2> Pronunciation: <span class='pronunciation'>" + data[3][5] +" </span> </h2> <h2> Definition: <span class='definition'>" + data[4][5] +" </span> </h2> <h2 id='listen1'> Example: </h2> <h2 class='example' >" + data[5][5] +" </h2> </div> </div>");
				$("#noidunghoc").show();
				$("#noidungtuvung").hide();
			
			
			},
			error: function(){
				alert("loi");
			}
				
		});		

	
					
	});	
					
	$(document).on('click', '#left6', function(){ 
		$.ajax({
			
			url: 'noidung.php',		
			type: "GET",
			async: false,
			dataType: 'json',
			success: function(data){
	
				$("#noidunghoc").html(" <div class='well well-adjust text-center'> <h3 class='lession'> Beginner </h3> </div> <div class='well well-adjust' style='margin'> <div style='padding-top: 10px'> <h2 class='text-center' style='font-family:'Kaushan Script',cursive,Time,serif;'> Lession " + 7 +"(Click the word to listen) </h2> </div> <div style='padding-left: 30px;'> <h1>LESSION WORD: <span class='vocab' id='list7'>" + data[1][6] + "  </span> </h1> <h2> Pronunciation: <span class='pronunciation'>" + data[3][6] +" </span> </h2> <h2> Definition: <span class='definition'>" + data[4][6] +" </span> </h2> <h2 id='listen1'> Example: </h2> <h2 class='example' >" + data[5][6] +" </h2> </div> </div>");
				$("#noidunghoc").show();
				$("#noidungtuvung").hide();
			
			
			},
			error: function(){
				alert("loi");
			}
				
		});										

					
	});	
					
	$("#left7").click(function(){
		$.ajax({
			
			url: 'noidung.php',		
			type: "GET",
			async: false,
			dataType: 'json',
			success: function(data){
	
				$("#noidunghoc").html(" <div class='well well-adjust text-center'> <h3 class='lession'> Beginner </h3> </div> <div class='well well-adjust' style='margin'> <div style='padding-top: 10px'> <h2 class='text-center' style='font-family:'Kaushan Script',cursive,Time,serif;'> Lession " + 8 +"(Click the word to listen) </h2> </div> <div style='padding-left: 30px;'> <h1>LESSION WORD: <span class='vocab' id='list8'>" + data[1][7] + "  </span> </h1> <h2> Pronunciation: <span class='pronunciation'>" + data[3][7] +" </span> </h2> <h2> Definition: <span class='definition'>" + data[4][7] +" </span> </h2> <h2 id='listen1'> Example: </h2> <h2 class='example' >" + data[5][7] +" </h2> </div> </div>");
				$("#noidunghoc").show();
				$("#noidungtuvung").hide();
			
			
			},
			error: function(){
				alert("loi");
			}
				
		});										

					
	});	
										
	$(document).on('click', '#left8', function(){ 
		$.ajax({
			
			url: 'noidung.php',		
			type: "GET",
			async: false,
			dataType: 'json',
			success: function(data){
	
				$("#noidunghoc").html(" <div class='well well-adjust text-center'> <h3 class='lession'> Beginner </h3> </div> <div class='well well-adjust' style='margin'> <div style='padding-top: 10px'> <h2 class='text-center' style='font-family:'Kaushan Script',cursive,Time,serif;'> Lession " + 9 +"(Click the word to listen) </h2> </div> <div style='padding-left: 30px;'> <h1>LESSION WORD: <span class='vocab' id='list9'>" + data[1][8] + "  </span> </h1> <h2> Pronunciation: <span class='pronunciation'>" + data[3][8] +" </span> </h2> <h2> Definition: <span class='definition'>" + data[4][8] +" </span> </h2> <h2 id='listen1'> Example: </h2> <h2 class='example' >" + data[5][8] +" </h2> </div> </div>");
				$("#noidunghoc").show();
				$("#noidungtuvung").hide();
			
			
			},
			error: function(){
				alert("loi");
			}
				
		});									

					
	});	
					
	$(document).on('click', '#left9', function(){ 
		$.ajax({
			
			url: 'noidung.php',		
			type: "GET",
			async: false,
			dataType: 'json',
			success: function(data){
	
				$("#noidunghoc").html(" <div class='well well-adjust text-center'> <h3 class='lession'> Beginner </h3> </div> <div class='well well-adjust' style='margin'> <div style='padding-top: 10px'> <h2 class='text-center' style='font-family:'Kaushan Script',cursive,Time,serif;'> Lession " + 10 +"(Click the word to listen) </h2> </div> <div style='padding-left: 30px;'> <h1>LESSION WORD: <span class='vocab' id='list10' >" + data[1][9] + "  </span> </h1> <h2> Pronunciation: <span class='pronunciation'>" + data[3][9] +" </span> </h2> <h2> Definition: <span class='definition'>" + data[4][9] +" </span> </h2> <h2 id='listen1'> Example: </h2> <h2 class='example' >" + data[5][9] +" </h2> </div> </div>");
				$("#noidunghoc").show();
				$("#noidungtuvung").hide();
			
			
			},
			error: function(){
				alert("loi");
			}
				
		});										

					
	});	
					
	$(document).on('click', '#list1', function(){ 
		$.ajax({
			
			url: 'noidung.php',		
			type: "GET",
			async: false,
			dataType: 'json',
			success: function(data){
	
				link = data[2][0];

				/* Play an audio. */
				audio = new Audio(link);
				audio.play();
				return false;
			
			
			},
			error: function(){
				alert("loi");
			}
				
		});	

		
	});
					
	$(document).on('click', '#list2', function(){ 
		$.ajax({
			
			url: 'noidung.php',		
			type: "GET",
			async: false,
			dataType: 'json',
			success: function(data){
	
				link = data[2][1];

				/* Play an audio. */
				audio = new Audio(link);
				audio.play();
				return false;
			
			
			},
			error: function(){
				alert("loi");
			}
				
		});		

		
	});
					
	$(document).on('click', '#list3', function(){ 
	
		$.ajax({
			
			url: 'noidung.php',		
			type: "GET",
			async: false,
			dataType: 'json',
			success: function(data){
	
				link = data[2][2];

				/* Play an audio. */
				audio = new Audio(link);
				audio.play();
				return false;
			
			
			},
			error: function(){
				alert("loi");
			}
				
		});	
		
	});
					
	$(document).on('click', '#list4', function(){ 
	
		$.ajax({
			
			url: 'noidung.php',		
			type: "GET",
			async: false,
			dataType: 'json',
			success: function(data){
	
				link = data[2][3];

				/* Play an audio. */
				audio = new Audio(link);
				audio.play();
				return false;
			
			
			},
			error: function(){
				alert("loi");
			}
				
		});	
		
	});
					
	$(document).on('click', '#list5', function(){ 
	
		$.ajax({
			
			url: 'noidung.php',		
			type: "GET",
			async: false,
			dataType: 'json',
			success: function(data){
	
				link = data[2][4];

				/* Play an audio. */
				audio = new Audio(link);
				audio.play();
				return false;
			
			
			},
			error: function(){
				alert("loi");
			}
				
		});	
		
	});
					
	$(document).on('click', '#list6', function(){ 
	
		$.ajax({
			
			url: 'noidung.php',		
			type: "GET",
			async: false,
			dataType: 'json',
			success: function(data){
	
				link = data[2][5];

				/* Play an audio. */
				audio = new Audio(link);
				audio.play();
				return false;
			
			
			},
			error: function(){
				alert("loi");
			}
				
		});	
		
	});
					
	$(document).on('click', '#list7', function(){ 
	
		$.ajax({
			
			url: 'noidung.php',		
			type: "GET",
			async: false,
			dataType: 'json',
			success: function(data){
	
				link = data[2][6];

				/* Play an audio. */
				audio = new Audio(link);
				audio.play();
				return false;
			
			
			},
			error: function(){
				alert("loi");
			}
				
		});	
		
	});
					
	$(document).on('click', '#list8', function(){ 
	
		$.ajax({
			
			url: 'noidung.php',		
			type: "GET",
			async: false,
			dataType: 'json',
			success: function(data){
	
				link = data[2][7];

				/* Play an audio. */
				audio = new Audio(link);
				audio.play();
				return false;
			
			
			},
			error: function(){
				alert("loi");
			}
				
		});	
		
	});
					
	$(document).on('click', '#list9', function(){ 
	
		$.ajax({
			
			url: 'noidung.php',		
			type: "GET",
			async: false,
			dataType: 'json',
			success: function(data){
	
				link = data[2][8];

				/* Play an audio. */
				audio = new Audio(link);
				audio.play();
				return false;
			
			
			},
			error: function(){
				alert("loi");
			}
				
		});	
		
	});
					
	$(document).on('click', '#list10', function(){ 
	
		$.ajax({
			
			url: 'noidung.php',		
			type: "GET",
			async: false,
			dataType: 'json',
			success: function(data){
	
				link = data[2][9];

				/* Play an audio. */
				audio = new Audio(link);
				audio.play();
				return false;
			
			
			},
			error: function(){
				alert("loi");
			}
				
		});	
		
	});
		
		
	});
</script>

<body>


<nav class="navbar taikhoan">
  <div class="container-fluid">
		<ul class="nav navbar-nav">
			
		</ul>
		<ul class="nav navbar-nav navbar-right" id="getInfoUser">
			<li><a class='a' href="registration.php"><div>  Sign Up </div></a></li>
			<li><a href="logIn.php"><div>Login </div></a></li>
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
				<h2 class='text-center' id="beginner" > Beginner </h2>
			</div>
			
			<div class='btn btn-default board-ins englishlevel' style='padding-bottom: 8px; width: 80%'>
				<h2 class='text-center' id="intermediate"> Intermediate </h2>
			</div>
			
		</div>
		
		<div class='col-md-6' >
		
			<div class='btn btn-default board-ins englishlevel' style='padding-bottom: 8px; width: 80%'>
				<h2 class='text-center' id="elementary"> Elementary </h2>
			</div>
			
			<div class='btn btn-default board-ins englishlevel' style='padding-bottom: 8px; margin-bottom: 18px; width: 80%'>
				<h2 class='text-center' id="advanced"> Advanced </h2>
			</div>
			
		</div>
		
	</div>

</div>

<div class='board well well-adjust' id='noidungtuvung'>

	<div style='padding-top: 10px'>
		<h2 class='text-center' style="font-family:'Kaushan Script',cursive,Time,serif;"> Choose your lession: </h2>
	</div>
	
	<div class='row'>
	
		<div class='col-md-6' id="left">
		

			
		</div>
		
		<div class='col-md-6' id="right">
		
			
		</div>
		
	</div>

</div>

<div class="container-fluid" id="noidunghoc">


   
</div>


</body>

</html>