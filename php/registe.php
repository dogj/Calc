<?php
$servername = "localhost";
$username = "id1682891_dogj";
$password = "112233";
$dbname = "id1682891_dogj";

// Create connection
$conn = new mysqli($servername, $username, $password, $dbname);
// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}



$name=$_POST['name'];
$username = $_POST['username'];
$age = $_POST['age'];
$password = $_POST['password'];

$sql = "INSERT INTO dogj (username,password,name,age)
VALUES ('{$username}','{$password}','{$name}','{$age}')";

if ($conn->query($sql) === TRUE) {
    echo "New record created successfully";
} else {
    echo "The user name have been used." ;
}

$conn->close();
?>