package com.tutorial.interpreter.firstSample;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
* like mofaser
* tafsir statement
* ast abstract syntax tree
*
* */
public class Main {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("(<div>|<p>|<span>)(.*?)(</div>|</p>)");
        Matcher matcher = pattern.matcher("<div><p>test interpreter design pattern</p></div>");
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
