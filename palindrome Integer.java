import java.util.Scanner;

public class  {
    public static void main(String[] args) {
        int n=1,tem=0,num2=0;
        double cunt=0,i=0;

        System.out.println("Please input your number.");
        Scanner sc = new Scanner(System.in);
                int number = sc.nextInt();

        while(number/n>=1){
            cunt++;
            n*=10;
        }

        while(i<cunt){
            tem=(number/(int)Math.pow(10,i))%10;
            num2=(num2+tem*(int)(Math.pow(10,(cunt-1-i))));
            i++;
        }

        if(num2==number){
            System.out.println(num2+"回文整数");
        }
        else{
            System.out.println(num2+"不是回文整数");
        }
    }
}
