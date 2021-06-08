package com.tutorial.facade.firstSample;

import java.io.File;

/*
 * structural design pattern
 *  lots of libs or objects encapsulate in facade interface
 *  hide complicity
 *  client -> facade -> all frameworks , objects , libs
 *  facade = wrapper expression
 *
 * facade => maintenance,dont repeat yourself,clean Coding
 * */
public class Facade {
    public static void main(String[] args) {
//        wrong way
        System.out.println("Conversion started");
        VideoFile sourceFile = new VideoFile("youtubevideo.ogg");
        Codec sourceCodec = CodecFactory.extract(sourceFile);
        Codec destinationCodec = new MPEG4CompressionCodec();
        VideoFile buffer = BitrateReader.read(sourceFile, sourceCodec);
        VideoFile intermediateFile = BitrateReader.convert(buffer, destinationCodec);
        AudioMixer audioMixer = new AudioMixer();
        File finalResult = audioMixer.fix(intermediateFile);
        System.out.println("Conversion completed");

        System.out.println("----------------------");
        System.out.println("Conversion started");
        VideoFile sourceFile1 = new VideoFile("file2.mp4");
        Codec sourceCodec1 = CodecFactory.extract(sourceFile1);
        Codec destinationCodec1 = new OggCompressionCodec();
        VideoFile buffer1 = BitrateReader.read(sourceFile1, sourceCodec1);
        VideoFile intermediateFile1 = BitrateReader.convert(buffer1, destinationCodec1);
        AudioMixer audioMixer1 = new AudioMixer();
        File finalResult1 = audioMixer1.fix(intermediateFile1);
        System.out.println("Conversion completed");


        //Use Facade
        System.out.println("-------------Facade Started------------");
        VideoConverterFacade videoConverterFacade = new VideoConverterFacade();
        videoConverterFacade.convert("file3.mp4","ogg");

    }
}
