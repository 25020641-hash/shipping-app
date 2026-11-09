package com.lab;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class App6Test {
    @Test
    void testApp() {
        App6 app = new App6();
        assertEquals("Hello from Bai6", app.getMessage());
    }
}
