package Singleton;

public class Main {
    public static void main(String[] args) {
        SingletonIntance instance = SingletonIntance.getIntance();

        System.out.println(instance.increment() + " <- 1");
        System.out.println(instance.increment() + " <- 1");
        System.out.println(instance.increment() + " <- 1");
        System.out.println(instance.increment() + " <- 1");

        SingletonIntance intance2 = SingletonIntance.getIntance();
        System.out.println(intance2.increment() + " <- 2");
        System.out.println(intance2.increment() + " <- 2");

    }
}
