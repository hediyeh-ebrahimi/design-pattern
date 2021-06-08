package com.tutorial.facade.firstSample;

public class VideoFile {
    private String name;
    private String codecType;

    public VideoFile() {
    }

    public VideoFile(String name) {
        this.name = name;
        this.codecType = name.substring(name.indexOf(".") - 1);
    }

    public String getName() {
        return name;
    }

    public String getCodecType() {
        return codecType;
    }
}
