import java.util.Scanner;

public class Palindrome Interger2 {
    public static void main(String[] args) {
        int num,N;
        int num2=0;

        Scanner sc = new Scanner(System.in);
                System.out.println("Please Input Your Number.");
                N=num = sc.nextInt();

        while(num!=0){
            int ge = num % 10;
            num = num /10;
            num2=num2*10+ge;
        }

        if(N==num2){
            System.out.println("回文数");
        }
        else{
            System.out.println("不是回文数");
        }
    }
}
