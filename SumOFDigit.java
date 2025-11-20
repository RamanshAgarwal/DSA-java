import java.util.*;
public class SumOFDigit {
    public static void main(String[] args) {
        Scanner sc  =  new Scanner(System.in);
        System.out.print("ENTER THE  RESPECTIVE NUMBER  : ");
        int num = sc.nextInt();
        int sum = 0;
        sc.close();;
        while(num>0){
            sum=sum+(num%10);
            num=num/10;
        }
        System.out.println("THE SUM OF ALL DIGITS ARE :" + sum);
    }
}
