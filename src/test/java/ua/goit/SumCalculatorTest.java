package ua.goit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SumCalculatorTest {
    private SumCalculator sumCalculator;

    @BeforeEach
    public void init(){
        sumCalculator=new SumCalculator();
    }

    @Test
    public void sumTestingZero(){
        assertThrows(IllegalArgumentException.class,()-> sumCalculator.sum(0));
    }

    @Test
    public void sumTestingOne(){
        assertEquals(1,sumCalculator.sum(1));
    }

    @Test
    public void sumTestingTwo(){
        assertEquals(3,sumCalculator.sum(2));
    }

    @Test
    public void sumTestingThree(){
        assertEquals(6,sumCalculator.sum(3));
    }
}
