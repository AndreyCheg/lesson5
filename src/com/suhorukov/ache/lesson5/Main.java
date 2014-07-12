package com.suhorukov.ache.lesson5;

/**
 * Created by demo4 on 12.07.14.
 */
public class Main {

    public static void main(String arg[]){
        MyExcGen doomsdayMachine = new MyExcGen();
        System.out.println("hello! Try my exception generator!");
        for(ExcEnum i: ExcEnum.values()){
            try{
                switch (i)
                {
                    case NULL_POINTER:
                        doomsdayMachine.generateNullPointerException();
                        break;
                    case CLASS_CAST:
                        doomsdayMachine.generateClassCastException();
                        break;
                    case NUMBER_FORMAT:
                        doomsdayMachine.generateNumberFormatException();
                        break;
                    case STACK_OVERFLOW:
                        doomsdayMachine.generateStackOverflowError();
                        break;
                    case OUT_OF_MEMORY:
                        doomsdayMachine.generateOutOfMemoryError();
                        break;
                    case MY_EXCEPTION:
                        doomsdayMachine.generateMyException("it's my! ;-)");
                }
            } catch (NullPointerException | ClassCastException | NumberFormatException | OutOfMemoryError ex){
                System.out.println("UPS! Some thing wrong ;-) " + ex.getMessage());
                ex.printStackTrace();
            } catch (StackOverflowError ex){
                System.out.println("UPS! Stack overflow occur.\nSorry, but I will not print the entire stack trace. It's too large");
            } catch (MyException ex) {
                System.out.println(ex.getMessage());
                ex.printStackTrace();
            }
        }

    }
}
