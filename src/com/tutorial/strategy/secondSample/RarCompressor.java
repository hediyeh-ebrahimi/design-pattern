package com.tutorial.strategy.secondSample;

import java.io.File;

public class RarCompressor implements CompressionStrategy {
    @Override
    public void compress(File file) {
        System.out.println("Rar Compressor");
    }
}
