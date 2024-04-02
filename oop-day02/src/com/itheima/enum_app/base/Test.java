package com.itheima.enum_app.base;

public class Test {

    private static void change(Signal color) {
        switch (color) {
            case RED -> System.out.println("STOP");
            case GREEN -> System.out.println("GO");
            case YELLOW -> System.out.println("WAIT");
        }
    }

    public static void main(String[] args) {
        change(Signal.YELLOW);
    }

}
