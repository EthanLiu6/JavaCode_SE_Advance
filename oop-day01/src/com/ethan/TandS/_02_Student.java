package com.ethan.TandS;

public class _02_Student extends _01_Person {
    private String cid;
    private String reBack;

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getReBack() {
        return reBack;
    }

    public void setReBack(String reBack) {
        this.reBack = reBack;
    }


    public void learn() {
        System.out.println("学生好好学习");
    }
}
