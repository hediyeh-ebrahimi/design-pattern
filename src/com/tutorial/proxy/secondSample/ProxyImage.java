package com.tutorial.proxy.secondSample;

public class ProxyImage implements Image {

    private RealImage realImage;

    public ProxyImage(String url) {
        this.realImage = new RealImage(url);
    }

    @Override
    public void displayImage() {
        this.realImage.displayImage();
    }
}
