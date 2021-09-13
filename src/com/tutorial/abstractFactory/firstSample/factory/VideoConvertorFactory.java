package com.tutorial.abstractFactory.firstSample.factory;

import com.tutorial.abstractFactory.firstSample.Converter;

import java.io.File;

public class VideoConvertorFactory implements MediaFactory {
    @Override
    public Converter createConvertor(File file, Converter.codecType codecType) {
        String fileName = file.getName().toLowerCase();
        throw new IllegalStateException("Convertor not found");
//        return null;
    }
}
