package com.javatest.exceptionhandling;

public class ThrowingUserDefinedException {
    public static void main(String[] args) {
        try {
            //throw an object of user defined exception
            throw new UserDefinedException("This is user-defined exception");
        }catch (UserDefinedException ude){
            System.out.println("Caught the exception");
            //print the message from MyException object
            System.out.println(ude.getMessage());
        }
    }

}
class UserDefinedException extends Exception{
    public UserDefinedException(String str){
        // Calling constructor of parent Exception
        super(str);
    }
}