import java.util.*;
public class GreaterNoIn4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER FIRST NUMBER : ");
        int a = sc.nextInt();
        System.out.print("ENTER SECOND NUMBER : ");
        int b = sc.nextInt();
        System.out.print("ENTER THIRD NUMBER : ");
        int c = sc.nextInt();
        System.out.print("ENTER FOURTH NUMBER : ");
        int d = sc.nextInt();
        sc.close();
        if(a>b){
            if(a>c){
                if(a>d){
                    System.out.println(a + " "+  "IS THE LARGEST NUMBER");
                }
                else{
                    System.out.println(d +" "+  " IS THE LARGEST NUMBER");
                }
            }
            else{
                if(c>d){
                    System.out.println(c +" "+  " IS THE LARGEST NUMBER");
                }
                else{
                    System.out.println(d +" "+  " IS THE LARGEST NUMBER");
                }
            }
        }
        else{
            if(b>d){
                System.out.println(b+ "IS THE LARGEST NUMBER");
            }
            else{
                System.out.println(d + "IS THE LARGEST NUMBER");
            }
        }
    }
}
