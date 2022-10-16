import java.util.Scanner;

public class NegativeBinomialDistributionDemo {
    //计算负二项分布的概率
    //即在一串伯努利试验中，概率为p的事件在第r次发生时的试验次数X的分布率
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("please inout r and p");
        int r1 = sc.nextInt();                      //r1-r3为需要事件发生的次数
        double p = sc.nextDouble();                 //p为事件发生的概率

        int r2,r3;
        r2=r3=r1;

        //表头1-4
        for (int i=1; i <= 4; i++) {
            System.out.print(r1 + "\t"+"\t");
            r1++;
        }
        //表头k-1与k
        System.out.println("……"+"\t"+"\t"+"k-1"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"k");

        //计算并输出k=1-4时的概率
        for(int i=1; i<=4;i++){
            System.out.printf("%.4f",factorial(r2+i-1)/(factorial(r2-1)*factorial(i))*(Math.pow(p,r2))*Math.pow((1-p),i));
            r2++;
            System.out.print("\t");
        }

        int r4=r3-1;
            // 抽取k-1次时的概率
            System.out.print("……" + "\t" + "\t" + "C(k-2," + r4 + ")*");
            System.out.printf("%.3f", Math.pow(p, r3));
            System.out.print("*q^(k-r-1)");
            //抽取k次的概率
            System.out.print("\t" + "C(k-1," + r3 + ")*");
            System.out.printf("%.3f", Math.pow(p, r3));
            System.out.println("*q^(k-r)");
    }

    public static int factorial(int num){//简单的循环计算的阶乘

        int sum=1;

        if(num<0){//判断传入数是否为负数

            throw new IllegalArgumentException("必须为正整数!");//抛出不合理参数异常

        }

        for(int i=1;i<=num;i++){//循环num

            sum *= i;//每循环一次进行乘法运算

        }

        return sum;//返回阶乘的值

    }
}