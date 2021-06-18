package com.tutorial.proxy.secondSample;

public class RealImage implements Image {

    public RealImage(String url){
        loadImage(url);
    }

    private void loadImage(String url) {
        System.out.println("RealImage Class LoadImage method");
    }

    @Override
    public void displayImage() {
        System.out.println("RealImage Class DisplayImage method");
    }
}
