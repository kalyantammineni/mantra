package com.mantra.exercise.cards;

import java.util.HashMap;
import java.util.Map;

public enum MyCard {
	ACE("1"), TWO("2"), THREE("3"), FOUR("4"), FIVE("5"), SIX("6"), SEVEN("7"), EIGHT("8"), NINE("9"), TEN("10"), JACK("11"), QUEEN("12"), KING("13");
	
	public final String label;

    private MyCard(String label) {
        this.label = label;
    }
    
private static final Map<String, MyCard> BY_LABEL = new HashMap<>();
    
    static {
        for (MyCard e: values()) {
            BY_LABEL.put(e.label, e);
        }
    }

   // ... fields, constructor, methods

    public static MyCard valueOfLabel(String label) {
        return BY_LABEL.get(label);
    }
 }
