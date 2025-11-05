package com.codewithabhinav;

import com.codewithabhinav.exceptions.ExceptionsDemo;

public class Main  {
    public static void main(String[] args) {
        try {
            ExceptionsDemo.show();
        } catch (Throwable e) {
            var cause = e.getCause();
            System.out.println(cause.getMessage());
        }
    }
}