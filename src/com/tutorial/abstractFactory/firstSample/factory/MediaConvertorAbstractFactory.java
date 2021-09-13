package com.tutorial.abstractFactory.firstSample.factory;

public interface  MediaConvertorAbstractFactory {

     enum MediaFactoryType {
        VIDEO, MUSIC, IMAGE
    }

    static MediaFactory createFactory(MediaFactoryType mediaFactoryType) {
        switch (mediaFactoryType) {
            case VIDEO:
                return new VideoConvertorFactory();
            case MUSIC:
                return new MusicConvertorFactory();
            case IMAGE:
                return new ImageConvertorFactory();
        }
        throw new IllegalStateException("Bad Type");
    }
}
