package com.tutorial.factory.musicPlayerSample;

import java.util.Objects;

public class PlayerFactory {

    public Player getInstance(String filePath, PlayerEnum type) {
        Objects.requireNonNull(filePath);
        Objects.requireNonNull(type);
        Player player;
        switch (type) {
            case Mp3:
                player = new Mp3Player(filePath);
                break;
            case Ogg:
                player = new OggPlayer(filePath);
                break;
            default:
                throw new IllegalStateException();
        }
        return player;

    }


}
