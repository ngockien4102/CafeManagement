package com.example.demo.Utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class CafeUtils {
    private CafeUtils(){

    }

    public static ResponseEntity<String> getResponseEntity(String responseMessage, HttpStatus httpStatus){
        return  new ResponseEntity<String>("{\"Message\":\""+responseMessage+"\"}",HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
