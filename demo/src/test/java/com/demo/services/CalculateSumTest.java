package com.demo.services;

import com.demo.serviceImpl.Calculate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculateSumTest {

    @Autowired
    Calculate calculateSum;

    @Test
    public void shouldAdd(){
        assertEquals(calculateSum.calculateSum(4,6),10);
    }

}
