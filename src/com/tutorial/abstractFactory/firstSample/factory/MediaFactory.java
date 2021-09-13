package com.tutorial.abstractFactory.firstSample.factory;

import com.tutorial.abstractFactory.firstSample.Converter;

import java.io.File;

public interface MediaFactory {
    Converter createConvertor(File file, Converter.codecType codecType);
}
