package com.example.publisherapp.enums;

import java.util.List;
import java.util.Random;

public enum Action {
    PURCHASE,
    SUBSCRIPTION;

    private static final List<Action> values = List.of(values());
    private static final int size = values.size();
    private static final Random random = new Random();

    public static Action getRandomAction() {
        return values.get(random.nextInt(size));
    }
}
