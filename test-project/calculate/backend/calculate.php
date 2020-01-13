<?php

//header("Access-Control-Allow-Origin: *"); 

include_once "Operation.php";
include_once "../utils/RequestUtils.php";

$request = (object)$_REQUEST;

/*
$request = RequestUtils::getRequestObj(
    $argv[1],
    $_SERVER,
    $_REQUEST);
*/

//sleep(2);


echo Operation::getJsonResult(

    $request->firstNumber,

    $request->secondNumber,

    $request->operation
);

