package com.itheima.polymorphic.demo3;


public class Test1 {
    public static void main(String[] args) {
        useAnimal(new Cat("六姨", "花色"));
        System.out.println("---------");

        useAnimal(new Dog("包姐", "白色"));
        System.out.println("---------");

        useAnimal(new Pig("珠珠", "好看色"));
        System.out.println("---------");


    }

    public static void useAnimal(Animal animal) {
        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.eat();
            cat.catchMouse();
        } else if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.eat();
            dog.lookDoor();
        } else if (animal instanceof Pig) {
            Pig pig = (Pig) animal;
            pig.eat();
            pig.sleep();
        }

    }

}

