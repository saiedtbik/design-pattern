import org.apache.commons.codec.digest.DigestUtils;

public class SHAHash implements HashStrategy {
    @Override
    public byte[] hash(String text) {
        return DigestUtils.sha256(text);
    }
}

