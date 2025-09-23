package com.LLDLogger.LogHandler;

public class ErrorLogHandler extends LogHandler {

    public ErrorLogHandler(LogHandler NextLogHandler) {
        super(NextLogHandler);
    }
    @Override
    public void log(int logLevel, String message) {
        if(logLevel == ERROR){
            System.out.println("Error : " + message);;
        } else if(this.nextHandler != null){
            super.log(logLevel, message);
        }
    }
}
