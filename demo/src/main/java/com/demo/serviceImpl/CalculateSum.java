package com.demo.serviceImpl;

import org.springframework.stereotype.Service;

@Service
public class CalculateSum implements Calculate {

    @Override
    public int calculateSum(int numA, int numB) {
        return numA + numB;
    }
}
