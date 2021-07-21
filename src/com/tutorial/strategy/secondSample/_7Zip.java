package com.tutorial.strategy.secondSample;

import java.io.File;

public class _7Zip implements CompressionStrategy {
    @Override
    public void compress(File file) {
        System.out.println("7Zip Compressor");
    }
}
