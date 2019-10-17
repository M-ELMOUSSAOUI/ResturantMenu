<?php

function VerifierLoginPwd($login , $pass)

{ if ($login == "admin" && $pass == "admin"){
return true;}

else return false;
}
?>