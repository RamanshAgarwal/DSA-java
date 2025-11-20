import java.util.Scanner;
public class IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number :");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number :");
        int secondNumber = scanner.nextInt();
        System.out.println("Enter third number :");
        int thirdNumber = scanner.nextInt();
        scanner.close();
        if(firstNumber>secondNumber){
            if(firstNumber>thirdNumber){
                System.out.println("firstNumber is greater");
            }
            else{
                System.out.println("thirdNumber is largest");
            }
        }
            else{
                if(secondNumber>thirdNumber){
                    System.out.println("secondNumber is Largest");
                }
                else{
                    System.out.println("thirdNumber is largest ");
                }
            }
        }
    }

