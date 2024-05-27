package lesson9.taskNumber2;

public class WrongLoginException extends Exception{
    public WrongLoginException(){}
    public WrongLoginException(String message){
        super(message);
    }
}
