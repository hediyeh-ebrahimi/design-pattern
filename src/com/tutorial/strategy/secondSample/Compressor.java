package com.tutorial.strategy.secondSample;

import java.io.File;

public class Compressor {
    private final CompressionStrategy compressionstrategy;

    public Compressor(CompressionStrategy compressionstrategy) {
        this.compressionstrategy = compressionstrategy;
    }

    public void compress(File file){
        this.compressionstrategy.compress(file);
    }
}
