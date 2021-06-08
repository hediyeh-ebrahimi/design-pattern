package com.tutorial.facade.firstSample;

public class CodecFactory {
    public static Codec extract(VideoFile file){
        String type = file.getCodecType();
        if(type.equals("mp4")){
            System.out.println("Convert.CodecFactory: extracting Mpeg audio...");
            return new MPEG4CompressionCodec();
        }else{
            System.out.println("Convert.CodecFactory: extracting Ogg audio...");
            return new OggCompressionCodec();
        }
    }
}
