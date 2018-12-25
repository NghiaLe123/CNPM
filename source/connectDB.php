<?php
/**
 * This class to connect into database and auto create table that has name loginUsers.
 * The table that to save information about user.
 */
$sName="localhost";
$uname="root";
$passwd="";
$database="english_vocabulary";
$conn=mysqli_connect($sName,$uname,$passwd,$database);

if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
} 
echo "Connected successfully";
//create a table that this name is loginUsers
$sql="CREATE TABLE loginUsers(
		id int(11) NOT NULL AUTO_INCREMENT,
		name VARCHAR(100) COLLATE utf8_vietnamese_ci NOT NULL ,
		type VARCHAR(100) COLLATE utf8_vietnamese_ci DEFAULT 'user',
		email VARCHAR(100) COLLATE utf8_vietnamese_ci NOT NULL , 
		phone VARCHAR(15) COLLATE utf8_vietnamese_ci NOT NULL ,
		password VARCHAR(255) COLLATE utf8_vietnamese_ci NOT NULL,
		created datetime NOT NULL,
		modified datetime NOT NULL,
		status enum('1','0') COLLATE utf8_vietnamese_ci NOT NULL DEFAULT '1',
		PRIMARY KEY (id)
		) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_vietnamese_ci;";
		
		if ($conn->query($sql) === TRUE) 
		{
			echo "Table <b>loginUsers</b> created successfully";
		} else 
		{
			echo "Error creating table: " . $conn->error;
		}
$conn->close();

?>