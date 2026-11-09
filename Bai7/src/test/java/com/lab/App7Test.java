package com.lab;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class App7Test {
    @Test
    void testApp() {
        App7 app = new App7();
        assertEquals("Hello from Bai7", app.getMessage());
    }
}
