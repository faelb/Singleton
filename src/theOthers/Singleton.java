package theOthers;

public class Singleton {

    private static Singleton mySingleton = null;
    private String s;

    private Singleton() {

    }

    public static Singleton getSingleton() {
        if (mySingleton == null) {
            mySingleton = new Singleton();
        }
        return mySingleton;
    }

    public void setS(String s) {
        this.s = s;
    }

    public void saySomething() {

        System.out.println(s);
    }

}
