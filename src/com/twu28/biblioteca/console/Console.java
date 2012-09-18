package com.twu28.biblioteca.console;

import java.io.IOException;

public interface Console {
    void println(String string);

    String takeInput() throws IOException;

}
