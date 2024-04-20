package io.github.ethanliu6.genericity.demo03;

/**
 * @Author EthanLiu 16693226842@163.com
 * @Date 2024/4/20 17:10
 * @Project JavaCode_SE_Advance
 * @Theme 泛型通配符
 */
public class Student extends Person {
    private double score;
    private String sid;

    public void study() {
        System.out.println("学生上学爱学习");
    }

    public Student(double score, String sid) {
        this.score = score;
        this.sid = sid;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }
}
