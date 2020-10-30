package lev2_les2;

public class MyArraySizeException extends Exception{
    public MyArraySizeException(){};
    public MyArraySizeException(String Message){
        super(Message);
    }
    public MyArraySizeException(String Message, Throwable cause){
        super(Message, cause);
    }
}
