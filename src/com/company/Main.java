package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> myStrings = new ArrayList<>();
        myStrings.add("abc");
        myStrings.add("def");
        myStrings.add("ghi");
        myStrings.add(null);

            myStrings.get(3);


        UpperCaseStringList upperCaseStrings = new UpperCaseStringList(myStrings);

        System.out.println(upperCaseStrings.getUpperCaseStrings());
	// write your code here
    }
}
