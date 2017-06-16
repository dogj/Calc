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



$sql = "UPDATE dogj SET password = '$password', name= '$name', age = $age WHERE username = '$username'";

if ($conn->query($sql) === TRUE) {
    echo "Update success";
} else {
    echo "Update failed" ;
}

$conn->close();
?>