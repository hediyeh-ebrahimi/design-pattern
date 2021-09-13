package com.tutorial.abstractFactory.firstSample.factory;

import com.tutorial.abstractFactory.firstSample.Bmp2JpgConvertor;
import com.tutorial.abstractFactory.firstSample.Converter;

import java.io.File;

public class ImageConvertorFactory implements MediaFactory {
    @Override
    public Converter createConvertor(File file , Converter.codecType codecType){
        String fileName = file.getName().toLowerCase();
        if(fileName.endsWith(".bmp")){
            switch (codecType){
                case JPG:
                    return new Bmp2JpgConvertor(file);
            }

        }
        throw new IllegalStateException("Convertor not found");
    }
}
