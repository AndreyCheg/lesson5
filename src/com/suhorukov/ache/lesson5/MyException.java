package com.suhorukov.ache.lesson5;

/**
 * Created by demo4 on 12.07.14.
 */
public class MyException extends Exception{
    public MyException(String thing){
        super("wrong " + thing);
    }
}
