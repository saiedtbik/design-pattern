
public class EagerSingleton{

    private static final  EagerSingleton INSTANCE;
    static {
        INSTANCE = new EagerSingleton();
    }
    private EagerSingleton() {
    }
    public static EagerSingleton getInstance(){
        return INSTANCE;
    }

}
