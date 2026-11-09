package com.lab;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class App8Test {
    @Test
    void testApp() {
        App8 app = new App8();
        assertEquals("Hello from Bai8", app.getMessage());
    }
}
