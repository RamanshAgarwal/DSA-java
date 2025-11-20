import java.util.*;

public class PrimesInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE STARTING POINT: ");
        int start = sc.nextInt();
        System.out.print("ENTER THE ENDING POINT   : ");
        int end = sc.nextInt();
        for (int i = start; i <= end; i++) {
            if (i < 2) {
                System.out.println(i + " NOTPRIMENUMBER ");
            } else if (i == 2) {
                System.out.println(i + " ISPRIMENUMBER ");
            } else {
                boolean flag = true;
                for (int j = 2; j * j <= i; j++) {
                    if (i % j == 0) {
                        System.out.println(i + " NOTPRIMENUMBER ");
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    System.out.println(i + " ISPRIMENUMBER ");
                }

            }
            sc.close();
        }
    }
}
