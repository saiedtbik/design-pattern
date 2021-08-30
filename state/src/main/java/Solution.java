public class Solution {

    public static void main(String[] args) {
        TV tv = new TV(OFF.getInstance());
        tv.togglePower();
        tv.togglePower();
    }
}
