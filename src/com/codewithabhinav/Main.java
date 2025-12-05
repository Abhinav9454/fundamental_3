package com.codewithabhinav;

import com.codewithabhinav.generics.GenericList;
import com.codewithabhinav.generics.User;

public class Main  {
    public static void main(String[] args) {
        GenericList<Integer> numbers = new GenericList<>();
        numbers.add(1); // boxing
        int number = numbers.get(0);  // unboxing
    }
}