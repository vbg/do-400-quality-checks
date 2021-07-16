package com.redhat.simple.calculator;

import java.util.Random;

public final class BasicCalculator extends Calculator {

    public int random() {
        Random r = new Random();

        return r.nextInt();
    }
}
