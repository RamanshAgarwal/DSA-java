import java.util.*;
public class PrintDigitNew {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER : ");
        int num = sc.nextInt();
        int reverse = 0;
        int lastDigit = 0;
        sc.close();
        while(num>0){
            lastDigit=num%10;
            num=num/10;
            reverse = reverse*10 + lastDigit;
        }
        while(reverse>0){
            int t = reverse %10;
            reverse  = reverse /10;
            System.out.println(t);
        }
    }
}
