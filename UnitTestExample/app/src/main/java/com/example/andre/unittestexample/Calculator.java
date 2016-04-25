package com.example.andre.unittestexample;

/**
 * Created by Andre on 25.04.2016.
 */
public class Calculator {

    private int result;

    public void add(int i, int i1) {
        result = i+i1;
    }

    public int getResult() {
        return result;
    }

    public void sub(int i, int i1) {
        result = i-i1;
    }

    public void mult(int i, int i1) {
        result = i*i1;
    }

    public void div(int i, int i1) {
        result = i/i1;
    }
}
