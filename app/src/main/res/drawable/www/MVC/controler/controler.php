<?php

include_once("../model/model.php");

if (isset($_GET['authButton'])){

if(VerifierLoginPwd($_GET['nn'] , $_GET['pp'])){

include ('../View/view.php');
}else{
include '../View/index.php';
}
}
?>