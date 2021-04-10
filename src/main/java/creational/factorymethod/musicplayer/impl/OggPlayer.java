package creational.factorymethod.musicplayer.impl;

import creational.factorymethod.musicplayer.MusicPlayer;

import java.io.File;

public class OggPlayer implements MusicPlayer {
    @Override
    public void play(File f) {
        System.out.println(" ogg player is playing music ...");
    }
}
