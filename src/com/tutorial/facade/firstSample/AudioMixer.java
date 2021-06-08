package com.tutorial.facade.firstSample;

import java.io.File;

public class AudioMixer {
    public File fix(VideoFile file) {
        System.out.println("convert.AudioMixer: fixing audio...");
        return new File("tmp");
    }
}
