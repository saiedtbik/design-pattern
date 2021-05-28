package musicplayer;

import musicplayer.enumuration.MusicFileType;
import musicplayer.impl.Mp3Player;
import musicplayer.impl.OggPlayer;

import java.text.MessageFormat;
import java.util.Objects;

public class MusicPlayerFactory {

    static MusicPlayer getInstance(MusicFileType type) throws IllegalStateException {

        Objects.requireNonNull(type);
        MusicPlayer player = null;
        switch (type) {
            case MP3:
                player = new Mp3Player();
                break;
            case OGG:
                player = new OggPlayer();
                break;
            default:
                throw new IllegalStateException(MessageFormat.format("MusicPlayer for {0} is not implemented", type));
        }
        return player;
    }

}
