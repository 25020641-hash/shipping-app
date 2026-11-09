package com.lab;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class App9Test {
    @Test
    void testApp() {
        App9 app = new App9();
        assertEquals("Hello from Bai9", app.getMessage());
    }
}
