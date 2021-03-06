package com.twu28.biblioteca.console;

import com.twu28.biblioteca.console.Console;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ConsoleStub implements Console {

    private List<String> lines = new ArrayList<String>();

    @Override
    public void println(String s) {
        lines.add(s);
    }

    @Override
    public String takeInput() throws IOException {
        return lines.remove(0);
    }

    public boolean isRequiredDataPresentOnConsole(String value) {
        return lines.contains(value);
    }
}

