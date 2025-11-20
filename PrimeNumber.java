import java .util.*;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER WHICH YOU WANT TO CHECK WHETHER IT IS PRIME OR NOT : ");
        int number = sc.nextInt();
        if(number<2){
            System.out.println("NOT A PRIME NUMBER ");
        }
        else if(number==2){
            System.out.println("PRIME");
        }
        else{
            int i;
            for(i = 2;i*i<number;i++){
                if(number%i==0){
                    System.out.println("NOT PRIME");
                    break;
                }
            }
            if(i*i>number){
                System.out.println("NUMBER IS PRIME");
            }
        }
        sc.close();
    }
}
