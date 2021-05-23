package com.tutorial.factory.musicPlayerSample;

import javazoom.jl.decoder.JavaLayerException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Mp3Player implements Player {

    private String filePath;

    public Mp3Player(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void play() throws MusicPlayerException {
        System.out.println("Mp3 Player play.");
        javazoom.jl.player.Player player = null;
        try {
            player = new javazoom.jl.player.Player(new FileInputStream(filePath));
            player.play();
        } catch (JavaLayerException | FileNotFoundException e) {
            e.printStackTrace();
            throw  new MusicPlayerException(e.getMessage());
        }
    }
}
