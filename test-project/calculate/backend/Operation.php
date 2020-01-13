<?php

class Operation {

    private static function notEmptyValues($n1, $n2){
	return ($n1 != "") && ($n2 != "");
    }
    
    private static function areNumbersInRange($n1, $n2){
        return ($n1 >= -100) && ($n1 <= 100) && ($n2 >= -100) && ($n2 <= 100);
    }

    private static function calculate($n1, $n2, $operation) {

        if (! Operation::notEmptyValues($n1, $n2)){
    	    return 'One number input is empty';
        }  
        
	if (! Operation::areNumbersInRange($n1, $n2)){
    	    return 'Number1 or Number2 is not in specified range: [-100, 100]';
        }  

        switch ($operation) {

            case 1:
                return $n1 + $n2;

            case 2:
                return $n1 * $n2;

            case 3:
                return $n2 == 0 ? 
                   'Cannot divide by 0'
                   : $n1 / $n2;

            default: 
                return 'Wrong operation: ' . $operation;
        }
    }


    public static function getJsonResult($n1, $n2, $operation) {

        $result = '{ "numbers": [ "' . $n1

            . '", "' . $n2 . '" ],'

            . '"operation": "' . $operation . '",'

            . '"result": "'

            . self::calculate($n1, $n2, $operation)

            . '" }';

        return $result;
    }

}

