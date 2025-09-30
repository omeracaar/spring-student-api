package com.omeracar.exception;

import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {

    private List<String> addMapValue(List<String> list,String newValue){
        list.add(newValue);
        return list;
    }

    //validationdan gelen exceptionları handle etmek ve response dönmek
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public void handleMethodArgumentNotValidException(MethodArgumentNotValidException e){
        Map<String, List<String>> errorsMap=new HashMap<>();
        for(ObjectError objectError : e.getBindingResult().getAllErrors()){
           String fieldName= ((FieldError)objectError).getField();
           if (errorsMap.containsKey(fieldName)){
            errorsMap.put(fieldName,addMapValue(errorsMap.get(fieldName),objectError.getDefaultMessage()));
           }else {
               errorsMap.put(fieldName,addMapValue(new ArrayList<>(),objectError.getDefaultMessage()));

           }
        }
    }


}
