package com.tutorial.factory.musicPlayerSample;

public class Main {
    public static void main(String[] args) throws MusicPlayerException {
        PlayerFactory playerFactory = new PlayerFactory();
        Player mp3Player = playerFactory.getInstance
                ("F:\\java_tutorial\\designPattern\\design-pattern\\oggFile.ogg",PlayerEnum.Ogg);
        mp3Player.play();
//        Player oggPlayer = playerFactory.getInstance(PlayerEnum.Ogg);
//        oggPlayer.play();
    }
}
