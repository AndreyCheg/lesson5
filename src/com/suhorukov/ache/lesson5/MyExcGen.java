package com.suhorukov.ache.lesson5;

import java.util.Objects;

/**
 * Created by demo4 on 12.07.14.
 */
public class MyExcGen implements ExceptionGenerator{
    private int crash(int x){
        int a = crash(1);
        return a + 1;
    }

    public void generateNullPointerException(){
        Object o = null;
        o.notify();
    }
    public void generateClassCastException(){
        Double d = (Double)(Object)(new String("err"));
    }
    public void generateNumberFormatException(){
        String s = "FOOBAR";
        int i = Integer.parseInt(s);
    }
    public void generateStackOverflowError(){
        crash(0);
    }
    public void generateOutOfMemoryError(){
        Double[] arr = new Double[400000000];
    }
    public void generateMyException(String message) throws MyException{
        throw new MyException("some thing");
    }
}
