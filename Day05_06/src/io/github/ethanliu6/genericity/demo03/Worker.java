package io.github.ethanliu6.genericity.demo03;

/**
 * @Author EthanLiu 16693226842@163.com
 * @Date 2024/4/20 17:11
 * @Project JavaCode_SE_Advance
 * @Theme 泛型通配符
 */
public class Worker extends Person {
    private String place;
    private double money;

    public void work(){
        System.out.println("工人工作拿工资");
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
