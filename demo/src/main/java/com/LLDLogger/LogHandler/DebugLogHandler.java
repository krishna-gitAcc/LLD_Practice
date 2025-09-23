package com.LLDLogger.LogHandler;

public class DebugLogHandler extends LogHandler {

    public DebugLogHandler(LogHandler NextLogHandler) {
        super(NextLogHandler);
    }
    @Override
    public void log(int logLevel, String message) {
        if(logLevel == DEBUG){
            System.out.println("Debug : " + message);;
        } else if(this.nextHandler != null){
            super.log(logLevel, message);
        }
    }

}
