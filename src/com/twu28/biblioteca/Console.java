package com.twu28.biblioteca;

import java.io.IOException;

public interface Console {
    void println(String string);

    String takeInput() throws IOException;

}
