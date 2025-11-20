import java.util.*;
public class ReverseanInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number which you want to be reverse : ");
        int num = sc.nextInt();
        sc.close();
       // int copy=num;
        int reverse = 0;
        int lastDigit = 0;
        while(num>0){
            lastDigit = num%10;
            num=num/10;
            reverse  = (reverse * 10) +lastDigit ;
        }
        System.out.println("the reversed number is : " + reverse);
    }
}
