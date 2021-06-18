package com.tutorial.proxy.secondSample;

import java.net.MalformedURLException;
import java.net.URL;

/*
*  proxy means namayandeh
*  possibility of wrapping give us
*  add control tasks to project for example (after or before login
* rmi = remote method invocation (proxy)
* proxy control object
*
* */
public class Proxy {

    public static void main(String[] args) throws MalformedURLException {
        Image image = new RealImage("test.com");
        Image imageProxy = new ProxyImage("test.com");

        image.displayImage();
        imageProxy.displayImage();

    }
}
