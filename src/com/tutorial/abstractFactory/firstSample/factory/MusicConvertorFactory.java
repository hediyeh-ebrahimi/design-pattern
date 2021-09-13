package com.tutorial.abstractFactory.firstSample.factory;

import com.tutorial.abstractFactory.firstSample.Converter;

import java.io.File;

public class MusicConvertorFactory implements MediaFactory {
    @Override
    public Converter createConvertor(File file, Converter.codecType codecType) {
        return null;
    }
}
