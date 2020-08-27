package com.in28minutes.tips.enums;

public enum Season{
    WINTER(1), SPRING(2), SUMMER(3), FAIL(4);

    private final int value;

    Season(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
