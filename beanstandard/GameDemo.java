package com.beanstandard;

import java.util.Random;

public class GameDemo1 {
    public static void main(String[] args) {

        //创建角色
        Role r1 = new Role("李华", 100,'男');
        Role r2 = new Role("张三丰", 100,'男');

        //展示角色信息
        r1.showroleinfor();
        r2.showroleinfor();

        //开始格斗
        while (true) {
            r1.attack(r2);
            if(r2.getBlood()==0){
                System.out.println(r1.getName()+"K.O."+
                        r2.getName());
                break;
            }

            r2.attack(r1);
            if(r1.getBlood()==0){
                System.out.println(r2.getName()+
                        "K.O."+r1.getName());
                break;
            }
        }
    }
}
