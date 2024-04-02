package com.ethan.template;

public abstract class Demo {
    public  void writeComposition(){
        head();
        contents();
        end();
    }

    public abstract void contents();

    private void head(){
        System.out.println("<My Baby>");
    }

    private void end(){
        System.out.println("This is my baby -- qiuzhu!");
    }

}
