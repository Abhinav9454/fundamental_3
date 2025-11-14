package com.codewithabhinav;

import com.codewithabhinav.generics.GenericList;
import com.codewithabhinav.generics.User;

public class Main  {
    public static void main(String[] args) {
        var list = new GenericList<User>();
        list.add(new User());
        User number = list.get(0);
    }
}