public class TV {
private State state;

    public TV(State remoteControl) {
        this.state = remoteControl;
    }

    public void setRemoteControl(State remoteControl) {
        this.state = remoteControl;
    }
    public void togglePower(){
        state.switchState(this);
    }
}
