package com.JavaIOPractice;

import java.io.Console;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {

        Charset UTF_8 = Charset.forName("UTF-8");
        Console console = System.console();
        Map<Integer, String> map = new HashMap<>();
        if (console == null) {
            System.err.println("No console.");
        }
        // try(
        //     InputStream inputStream = new FileInputStream("demo/src/main/java/com/JavaIOPractice/input.txt");
        //     OutputStream outputStream = new FileOutputStream("demo/src/main/java/com/JavaIOPractice/output.txt");
        // ) {
        //     byte[] buffer = new byte[1024];
        //     int bytesRead;
        //     while ((bytesRead = inputStream.read(buffer)) != -1) {
        //         System.err.println("Bytes Read: " + new String(buffer));
        //         outputStream.write(buffer, 0, bytesRead);
        //     }
        // } catch (Exception e) {
        //     e.printStackTrace();
        // }
    }
}
