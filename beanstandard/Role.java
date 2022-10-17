package com.beanstandard;

import java.util.Random;

public class Role {
    //属性，人物与血量
    private String Name;
    private int Blood;
    private char Gender;
    private String Face;

    String[] boyfaces = {"风流俊雅", "气宇轩昂", "相貌英俊", "五官端正", "相貌平平", "一塌糊涂", "面目狰狞"};
    String[] girlfaces = {"美奂绝伦", "沉鱼落雁", "婷婷玉立", "身材娇好", "相貌平平", "相貌简陋", "惨不忍睹"};

    String[] attacks_desc = {
            "%s使出了一招【背心钉】，转到对方的身后，一掌向%s背心的灵台穴拍去。",
            "%s使出了一招【游空探爪】，飞起身形自半空中变掌为抓锁向%s。",
            "%s大喝一声，身形下伏，一招【劈雷坠地】，捶向%s双腿。",
            "%s运气于掌，一瞬间掌心变得血红，一式【掌心雷】，推向%s。",
            "%s阴手翻起阳手跟进，一招【没遮拦】，结结实实的捶向%s。",
            "%s上步抢身，招中套招，一招【劈挂连环】，连环攻向%s。"
    };

    String[] injureds_desc = {
            "结果%s退了半步，毫发无损",
            "结果给%s造成一处瘀伤",
            "结果一击命中，%s痛得弯下腰",
            "结果%s痛苦地闷哼了一声，显然受了点内伤",
            "结果%s摇摇晃晃，一跤摔倒在地",
            "结果%s脸色一下变得惨白，连退了好几步",
            "结果『轰』的一声，%s口中鲜血狂喷而出",
            "结果%s一声惨叫，像滩软泥般塌了下去"
    };

    public Role() {
    }

    public Role(String Name, int Blood, char Gender) {
        this.Name = Name;
        this.Blood = Blood;
        this.Gender = Gender;
        setFace(Gender);
    }


    /**
     * 获取
     *
     * @return Name
     */
    public String getName() {
        return Name;
    }

    /**
     * 设置
     *
     * @param Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 获取
     *
     * @return Blood
     */
    public int getBlood() {
        return Blood;
    }

    /**
     * 设置
     *
     * @param Blood
     */
    public void setBlood(int Blood) {
        this.Blood = Blood;
    }

    /**
     * 获取
     *
     * @return Gender
     */
    public char getGender() {
        return Gender;
    }

    /**
     * 设置
     *
     * @param Gender
     */
    public void setGender(char Gender) {
        this.Gender = Gender;
    }

    /**
     * 获取
     *
     * @return Face
     */
    public String getFace() {
        return Face;
    }

    /**
     * 设置
     *
     * @param Gender;
     */
    public void setFace(char Gender) {
        Random r = new Random();
        if (Gender == '男') {
            int index = r.nextInt(boyfaces.length);
            this.Face = boyfaces[index];
        } else if (Gender == '女') {
            int index = r.nextInt(girlfaces.length);
            this.Face = girlfaces[index];
        } else {
            this.Face = "不男不女";
        }
    }

    public String toString() {
        return "Role{Name = " + Name + ", Blood = " + Blood + ", Gender = " + Gender + ", Face = " + Face + "}";
    }

    //方法 行为：攻击
    public void attack(Role role) {

        Random r = new Random();
        int index = r.nextInt(attacks_desc.length);
        String kungfu =attacks_desc[index];

        System.out.printf(kungfu,this.getName(),role.getName());

        //计算造成的伤害，随机数范围为1-20
        int hurt = r.nextInt(20) + 1;

        int remainblood = role.getBlood() - hurt;
        //对剩余血量进行验证并赋值，若小于0，赋值0
        remainblood = remainblood < 0 ? 0 : remainblood;
        role.setBlood(remainblood);

        //受伤描述
        if(remainblood>90){
            System.out.printf(injureds_desc[0],role.getName());
        }
        else if(remainblood>70){
            System.out.printf(injureds_desc[1],role.getName());
        }
        else if(remainblood>50){
            System.out.printf(injureds_desc[2],role.getName());
        }
        else if(remainblood>40){
            System.out.printf(injureds_desc[3],role.getName());
        }
        else if(remainblood>30){
            System.out.printf(injureds_desc[4],role.getName());
        }
        else if(remainblood>20){
            System.out.printf(injureds_desc[5],role.getName());
        }
        else if(remainblood>0){
            System.out.printf(injureds_desc[6],role.getName());
        }
        else {
            System.out.printf(injureds_desc[7],role.getName());
        }
        System.out.println();

    }

    public void showroleinfor() {
        System.out.println("姓名为" + getName());
        System.out.println("血量为" + getBlood());
        System.out.println("性别为" + getGender());
        System.out.println("长相" + getFace());
    }
}
