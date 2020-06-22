package ru.geekbrains.exception;

public class CustomSizeException extends ArrayIndexOutOfBoundsException{

    public CustomSizeException(String message){
        super("Превышен или недостаточен размер массива 4х4, а у вас - " + message);

    }
}
