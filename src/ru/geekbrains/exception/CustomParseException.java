package ru.geekbrains.exception;

public class CustomParseException extends RuntimeException{

    public CustomParseException(String message){
        super("не удалось преобразовать значение в ячейке" + message);
    }
}

