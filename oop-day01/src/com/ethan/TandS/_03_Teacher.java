package com.ethan.TandS;

public class _03_Teacher extends _01_Person {
    private String pName;
    private String paper;


    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getPaper() {
        return paper;
    }

    public void setPaper(String paper) {
        this.paper = paper;
    }


    public void teach() {
        System.out.println("老师教书育人");
    }
}
