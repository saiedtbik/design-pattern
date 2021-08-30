public class ON implements State {

    private static final State INSTANCE;
    static {
        INSTANCE = new ON();
    }

    private ON() {
    }
    public State getInstance(){
        return INSTANCE;
    }

    @Override
    public void switchState(TV tv) {
        System.out.println("TV is now ON ...");
        tv.setRemoteControl(OFF.getInstance());
        System.out.println("TV is now OFF ....");
    }
}
