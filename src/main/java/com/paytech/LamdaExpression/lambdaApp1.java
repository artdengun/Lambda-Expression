package com.paytech.LamdaExpression;

import org.w3c.dom.ls.LSOutput;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class lambdaApp1 {
    public static void main(String[] args) {

        // this name anonymus class

//        Predicate<String> predicate = new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                return s != null;
//            }
//        };

        // lambda expression versi 1

//        Predicate<String> predicate = (String value) -> {
//            return  value != null;
//        };(
//
            // lambda expression versi 2

        Predicate<String> predicate = (value) ->  { return value!=null; };

            // lamda expressionversi 3

        Predicate<String> predicate1 = (value) -> value!=null;


//
//        Function<String, String> function = new Function<String, String>() {
//            @Override
//            public String apply(String s) {
//                return null;
//            }
//        };

                // lambda expression 2

        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };


        Supplier<String> supplier = new Supplier<String>() {
            @Override
            public String get() {
              return "deni";
            }
        };
    }
}