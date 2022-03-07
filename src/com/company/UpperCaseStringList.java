package com.company;

import java.util.ArrayList;
import java.util.List;

public class UpperCaseStringList {
    private List<String> upperCaseStrings;

    public List<String> getUpperCaseStrings() {
        return upperCaseStrings;
    }

    public UpperCaseStringList(List<String> strings) {
        upperCaseStrings = new ArrayList<>();

        for (String nextString : strings) {
            try {
                String upper = nextString.toUpperCase();
                upperCaseStrings.add(upper);
            } catch (NullPointerException e) {
            }
        }
    }

}