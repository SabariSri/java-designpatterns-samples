package com.epam.onboarding.practise.design_patterns.singleton;

public class SingletonObject {
    private static SingletonObject instance;

    private SingletonObject() {
    }

    // Eager instantiation
    private static SingletonObject instance1 = new SingletonObject();

    public static SingletonObject getInstance1() {
        return instance1;
    }

    // Static block instantiation
    static {
        try {
            instance = new SingletonObject();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred in creating singleton object");
        }
    }

    public static SingletonObject getInstance2() {
        return instance;
    }

    // Lazy instantiation
    public static SingletonObject getInstance3() {
        if (instance == null)
            instance = new SingletonObject();
        return instance;
    }

    // Thread Safe Singleton
    public static synchronized SingletonObject getInstance4() {
        if (instance == null)
            instance = new SingletonObject();
        return instance;
    }


    // Double Checked Locking
    private static volatile SingletonObject instance5 = null;

    public SingletonObject getInstance5() {
        if (instance5 == null) {
            synchronized (SingletonObject.class) {
                if (instance5 == null)
                    instance5 = new SingletonObject();
            }
        }
        return instance5;
    }

    // Bill pugh Singleton
    private static class SingletonHelper {
        private static SingletonObject instance6 = new SingletonObject();
    }

    public static SingletonObject getInstance6() {
        return SingletonHelper.instance6;
    }

    public void printMessage() {
        System.out.println("Accessing via Singleton Object");
    }

}
