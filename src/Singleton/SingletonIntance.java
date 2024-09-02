package Singleton;

public class SingletonIntance {
    private static SingletonIntance intance;
    int count;

    public SingletonIntance() {
        this.count = 0;
    }

    public static SingletonIntance getIntance() {
        if (intance == null){
            intance = new SingletonIntance();
        }
        return  intance;
    }

    public int increment(){
        count++;
        return count;
    }
}
