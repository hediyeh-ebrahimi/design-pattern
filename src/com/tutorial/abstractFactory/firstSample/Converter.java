package com.tutorial.abstractFactory.firstSample;

import com.tutorial.abstractFactory.firstSample.exception.ConvertionException;

import java.io.File;

public abstract class Converter {
    private byte[] input;

    public Converter(File file) {
    }

    public Converter(byte[] input) {
        this.input = input;
    }

    public abstract byte[] convert() throws ConvertionException;

    public enum codecType{
        BMP,JPG,PNG,
        MP3,WAV,AAC,
        MP4,AVI,MKV
    }
}
