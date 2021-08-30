@FunctionalInterface
public interface HashStrategy {
    byte[] hash(String text);
}
