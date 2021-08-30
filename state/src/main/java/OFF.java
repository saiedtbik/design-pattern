public class OFF implements State {

    private static final State INSTANCE;
    static {
        INSTANCE = new OFF();
    }
    private OFF() {
    }

    public static State getInstance(){
        return INSTANCE;
    }
    @Override
    public void switchState(TV tv) {
        System.out.println("TV is now OFF ...");
        tv.setRemoteControl(OFF.getInstance());
        System.out.println("TV is now ON ....");

    }
}
