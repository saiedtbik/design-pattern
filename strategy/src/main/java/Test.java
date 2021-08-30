import org.apache.commons.codec.digest.DigestUtils;

public class Test {
    public static void main(String[] args) {
        SecureContent secureContent = new SecureContent("saied");
        byte[] md5Hash = secureContent.hash(new MD5());
        byte[] shaHash = secureContent.hash(new SHAHash());

        byte[] newHash = secureContent.hash(new HashStrategy() {
            @Override
            public byte[] hash(String text) {
                return  DigestUtils.sha384(text);
            }
        });

        // Lambda
        byte[] newHash2 = secureContent.hash(text -> DigestUtils.sha384(text));



    }
}
