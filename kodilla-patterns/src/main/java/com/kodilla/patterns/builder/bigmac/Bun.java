package com.kodilla.patterns.builder.bigmac;

public class Bun {

    public static final String WITHSESAME = "Withsesame";
    public static final String WITHOUTSESAME = "Withoutsesame";
    private final String bun;

    public Bun(String bun) {
        if (bun.equals(WITHSESAME) || bun.equals(WITHOUTSESAME)) {
            this.bun = bun;
        } else {
            throw new IllegalStateException("Chosen bun should be WITHSESAME or WITHOUTSESAME!");
        }
    }

    public String getBun() {
        return bun;
    }

    @Override
    public String toString() {
        return bun;
    }
}
