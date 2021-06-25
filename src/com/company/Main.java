package com.company;

public class Main {

    public static void main(String[] args) {
        String s = "12345";
        String temp = "";
        for (int i = 1 ;i<s.length();i++){
            temp += "*";
        }
        String b = s.split("3")[0];
        String c = s.split("3")[1];
        System.out.println(b);
        System.out.println(c);
    }
}
