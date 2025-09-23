package com.LLDLogger.LogHandler;

public abstract  class LogHandler {

    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    LogHandler nextHandler;

    public LogHandler(LogHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
    public void log(int logLevel, String message){
        if(this.nextHandler != null){
            this.nextHandler.log(logLevel, message);
        }
    }
}
