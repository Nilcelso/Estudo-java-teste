package com.estudonilcelso.springboottest;

import com.estudonilcelso.springboottest.controller.TestController;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestUnitController {

    @Test
    public void testUnit() {
        TestController controller = new TestController();
        String resultado = controller.saudacao("Nilcelso");
        assertEquals("Bem-vindo, Nilcelso", resultado);
    }

}
