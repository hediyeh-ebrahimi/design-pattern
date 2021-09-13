package com.tutorial.abstractFactory.firstSample;

import com.tutorial.abstractFactory.firstSample.exception.ConvertionException;

import java.io.File;

public class Bmp2JpgConvertor extends Converter {
    public Bmp2JpgConvertor(byte[] input) {
        super(input);
    }

    public Bmp2JpgConvertor(File file) {
        super(file);
    }

    @Override
    public byte[] convert() throws ConvertionException {
        return new byte[0];
    }
}
