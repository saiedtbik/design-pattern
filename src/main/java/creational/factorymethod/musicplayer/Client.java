package creational.factorymethod.musicplayer;

import creational.factorymethod.musicplayer.enumuration.MusicFileType;

import java.io.File;

public class Client {
    public static void main(String[] args) throws IllegalStateException {
        MusicPlayer player = MusicPlayerFactory.getInstance(MusicFileType.MP3);
        player.play(new File("mp3music"));
    }
}
