package com.LLDLogger.LogHandler;

public class InfoLogHandler extends LogHandler {

    public InfoLogHandler(LogHandler NextLogHandler) {
        super(NextLogHandler);
    }
    @Override
    public void log(int logLevel, String message) {
        if(logLevel == INFO){
            System.out.println("Info : " + message);;
        } else if(this.nextHandler != null){
            super.log(logLevel, message);
        }
    }

}
