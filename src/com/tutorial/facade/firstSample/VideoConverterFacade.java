package com.tutorial.facade.firstSample;

import java.io.File;

public class VideoConverterFacade {
    public File convert(String sourceFile1, String codec) {
        System.out.println("VideoConverterFacade: Conversion started");
        VideoFile sourceFile = new VideoFile(sourceFile1);
        Codec sourceCodec = CodecFactory.extract(sourceFile);
        Codec destinationCodec ;
        if(codec.equals("mp4")){
            destinationCodec = new MPEG4CompressionCodec();
        }else{
            destinationCodec = new OggCompressionCodec();
        }
        VideoFile buffer = BitrateReader.read(sourceFile, sourceCodec);
        VideoFile intermediateFile = BitrateReader.convert(buffer, destinationCodec);
        AudioMixer audioMixer = new AudioMixer();
        File finalResult = audioMixer.fix(intermediateFile);
        System.out.println("VideoConverterFacade: Conversion completed");

        return finalResult;

    }
}
