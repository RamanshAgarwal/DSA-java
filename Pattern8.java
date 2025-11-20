import java.util.*;
public class Pattern8  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER   : ");
        int n = sc.nextInt();
        sc.close();
        for(int row=1;row<=n;row++){
            for(int col = 1;col<=n;col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}

