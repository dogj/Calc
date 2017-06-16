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



$username = $_POST['username'];
$password = $_POST['password'];

$sql = "SELECT * FROM dogj WHERE username ='$username' AND password = '$password'";
$result = $conn->query($sql) or die (mysqli_connect_error());  
       if (mysqli_num_rows($result) > 0) {
            echo "login success";
        }else {
            echo "login failed";
        }

$conn->close();
?>