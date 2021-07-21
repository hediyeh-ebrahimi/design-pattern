package com.tutorial.strategy.secondSample;

import java.io.File;

/*
* behavioral
*  in runtime change behaviour of object
* context component (object that preforms the task)
* */
public class Main {
    public static void main(String[] args) {
        Compressor compressorRar = new Compressor(new RarCompressor());
        compressorRar.compress(new File("F:\\java_tutorial\\designPattern\\design-pattern\\log.xml"));

        Compressor compressor7Zip = new Compressor(new _7Zip());
        compressor7Zip.compress(new File("F:\\java_tutorial\\designPattern\\design-pattern\\log.xml"));

    }
}
