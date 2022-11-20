package com.kodilla.patterns.builder.bigmac;

public class Sauce {
    public static final String STANDARD = "standard";
    public static final String ISLANDS1000= "1000Islands";
    public static final String BARBECUE = "barbecue";
    private final String sauce;

    public Sauce(String sauce) {
        if (sauce.equals(STANDARD) || sauce.equals(ISLANDS1000)|| sauce.equals(BARBECUE)) {
            this.sauce = sauce;
        } else {
            throw new IllegalStateException("Chosen sauce should be one of: standard, 1000Islands or barbecue");
        }
    }
    public String getSauce() {
        return sauce;
    }

    @Override
    public String toString() {
        return  sauce ;
    }
}