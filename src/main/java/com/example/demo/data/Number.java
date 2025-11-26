package com.example.demo.data;

import java.util.concurrent.ThreadLocalRandom;

public class Number{

    private static final long MIN_12_DIGIT = 100_000_000_000L;

    // Maximum 12-digit number (999,999,999,999)
    private static final long MAX_12_DIGIT = 999_999_999_999L;

    public static long generateRandom12DigitNumber() {
        // ThreadLocalRandom multi-threaded environments ke liye zyada efficient hai
        return ThreadLocalRandom.current().nextLong(MIN_12_DIGIT, MAX_12_DIGIT + 1);
    }

}
