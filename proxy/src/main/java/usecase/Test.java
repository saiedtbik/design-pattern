package usecase;

public class Test {
    public int plus(int x , int y){
        return x+y;
    }

    public static void main(String[] args) throws Exception {
        Class<?> aClass = Class.forName("usecase.Test");
        Object test = aClass.newInstance();
        Object result = aClass.getMethod("plus", int.class, int.class).invoke(test,1,3);
        System.out.println(result);

    }
}
