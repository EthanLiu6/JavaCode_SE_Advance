package com.ethan.TandS;

public class _04_Test {
    public static void main(String[] args) {
        _02_Student s = new _02_Student();
        s.name = "爱辉";
        s.classes = "计科2202";
        s.courses = "计组";
        s.setReBack("自己学习比上课好");
        s.setCid("0313");
        s.learn();
        System.out.println(s.getReBack());

        _03_Teacher t = new _03_Teacher();
        t.name = "珠珠";
        t.classes = "计科2202";
        t.classes = "爱情心理学";
        t.setpName("计科学院");
        t.setPaper("没试卷");
        t.teach();
        System.out.println( t.getClasses() + t.getPaper() );
    }
}
