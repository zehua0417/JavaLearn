import java.util.Scanner;

public class  {
    public static void main(String[] args) {

        //输入一个数，判定是否为回文整数如121，2304032
        //cunt该数字的位数，num2该数前后颠倒的新数，tem用于调换位数

        int n=1,tem=0,num2=0;
        double cunt=0,i=0;

        System.out.println("Please input your number.");
        Scanner sc = new Scanner(System.in);
                int number = sc.nextInt();

        //计算位数
        while(number/n>=1){
            cunt++;                    
            n*=10;
        }

        //前后颠倒
        while(i<cunt){
            tem=(number/(int)Math.pow(10,i))%10;
            num2=(num2+tem*(int)(Math.pow(10,(cunt-1-i))));
            i++;
        }

        //判定颠倒前后是否相等
        if(num2==number){
            System.out.println(num2+"回文整数");
        }
        else{
            System.out.println(num2+"不是回文整数");
        }
    }
}
