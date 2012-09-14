package com.twu28.biblioteca;

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

    public String getRequiredDataFromConsole() {
        return lines.get(lines.size()-2);
    }
}

