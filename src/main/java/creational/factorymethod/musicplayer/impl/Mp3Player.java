package creational.factorymethod.musicplayer.impl;

import creational.factorymethod.musicplayer.MusicPlayer;

import java.io.File;

public class Mp3Player implements MusicPlayer {
    @Override
    public void play(File f) {
        System.out.println("mp3 player is playing music ...");
    }
}
