public class SecureContent {
  private String text;

    public SecureContent(String text) {
        this.text = text;
    }

    public byte[] hash(HashStrategy hashStrategy){
       return hashStrategy.hash(text);
    }
}
