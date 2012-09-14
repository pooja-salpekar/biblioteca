package com.twu28.biblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemConsole implements Console {


    @Override
    public void println(String stringToBePrinted) {
        System.out.println(stringToBePrinted);

    }

    @Override
    public String takeInput() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();

    }

}
