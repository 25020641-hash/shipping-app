package com.lab;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class App5Test {
    @Test
    void testApp() {
        App5 app = new App5();
        assertEquals("Hello from Bai5", app.getMessage());
    }
}
