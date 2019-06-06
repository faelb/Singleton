package theOthers.main;


import theOthers.Singleton;

public class Main {

    public static void main(String[] args) {

        Singleton hey1 = Singleton.getSingleton();

        Singleton hey2 = Singleton.getSingleton();


        hey1.setS("Manajah");
        hey1.saySomething();
        hey2.saySomething();
        //print ist dasselbe, da es sich um das Gleich Objekt handelt -> Singleton, only 1 possible instance
    }
}
