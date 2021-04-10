package creational.factorymethod.musicplayer;

import creational.factorymethod.musicplayer.enumuration.MusicFileType;
import creational.factorymethod.musicplayer.impl.Mp3Player;
import creational.factorymethod.musicplayer.impl.OggPlayer;

import static org.junit.Assert.*;

public class MusicPlayerFactoryTest {

    @org.junit.Test
    public void getInstance() {

        MusicPlayer mp3Player = MusicPlayerFactory.getInstance(MusicFileType.MP3);
        assertTrue( mp3Player instanceof Mp3Player);

        MusicPlayer oggPlayer = MusicPlayerFactory.getInstance(MusicFileType.OGG);
        assertTrue( oggPlayer instanceof OggPlayer);

    }
}