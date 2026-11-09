package com.lab;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class App10Test {
    @Test
    void testApp() {
        App10 app = new App10();
        assertEquals("Hello from Bai10", app.getMessage());
    }
}
