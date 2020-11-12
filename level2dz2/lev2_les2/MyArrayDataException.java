package lev2_les2;


public class MyArrayDataException extends RuntimeException{
    public MyArrayDataException(){};
    public MyArrayDataException(String Message){
        super(Message);
    }
    public MyArrayDataException(String Message, Throwable cause){
        super(Message, cause);
    }
}
