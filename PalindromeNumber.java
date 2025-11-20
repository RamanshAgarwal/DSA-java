import java.util.*;
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number which yo want to check whether palindrome or not : ");
        int num = sc.nextInt();
        int copy = num;
        int reverse = 0 ;
        int lastDigit = 0;
        while(num>0){
            lastDigit = num%10;
            num  = num/10;
            reverse = (reverse*10)+lastDigit;
        }
        if(copy == reverse ){
            System.out.println(" YES,the entered number is a palindrome number");
        }
        else{
            System.out.println(" NO,the entered number is not a palindrome number ");
        }
        sc.close();
    }
}
