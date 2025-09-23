package com.LLDLogger;

import com.LLDLogger.LogHandler.DebugLogHandler;
import com.LLDLogger.LogHandler.ErrorLogHandler;
import com.LLDLogger.LogHandler.InfoLogHandler;
import com.LLDLogger.LogHandler.LogHandler;

public class Logger {
    public static void main(String[] args) {
        // Chain of Responsibility Design Pattern
        // Info -> Debug -> Error
        LogHandler logHandler = new InfoLogHandler(new DebugLogHandler(new ErrorLogHandler(null)));
        logHandler.log(LogHandler.INFO, "This is an info message");
        logHandler.log(LogHandler.DEBUG, "This is a debug message");
        logHandler.log(LogHandler.ERROR, "This is an error message");
    }
}
