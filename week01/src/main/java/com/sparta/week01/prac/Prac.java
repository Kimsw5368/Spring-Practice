package com.sparta.week01.prac;

import java.util.ArrayList;
import java.util.List;

public class Prac {
    public static void main(String[] args){
        List<String> fruits = new ArrayList<>();
        fruits.add("감");
        fruits.add("배");
        fruits.add("딸기");
        fruits.add("수박");
        fruits.add("메론");
        fruits.add("감");
        fruits.add("배");
        fruits.add("딸기");
        fruits.add("수박");
        fruits.add("메론");
        System.out.println(fruits);

        for (int i=0; i<10; i++){
            String fruit = fruits.get(i);
            System.out.println(fruit);
        }
    }
}
