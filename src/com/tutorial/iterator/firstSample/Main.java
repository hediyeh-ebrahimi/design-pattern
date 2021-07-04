package com.tutorial.iterator.firstSample;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/*
 *  peymayesh
 *  hide back of code
 *  enumeration,iterator
 *  iterator = haasNext() ,next()
 *  => interface,factory method,iterator,concrete iterator
 * */
public class Main {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("str1", "str2");
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        try {
//            FileContentReader fileContentReader = new FileContentReader("F:\\java_tutorial\\designPattern\\design-pattern\\readme.md");
            FileContentReader fileContentReader = new FileContentReader("F:\\java_tutorial\\designPattern\\design-pattern\\log.xml");
//            FileContentReader fileContentReader = new FileContentReader("F:\\java_tutorial\\designPattern\\design-pattern\\test.txt");

            Iterator<String> iteratorFile = fileContentReader.iterator();
            while (iteratorFile.hasNext()) {
                System.out.println(iteratorFile.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
