public class OptimizedPrime {
    public static void main(String[] args) {
        int num = 36;
        for(int  i = 2;i*i<=num;i++){
            if(num%i==0){
                System.out.println("not prime");
                return;
            }
        }
        System.out.println("prime");
    }
}
