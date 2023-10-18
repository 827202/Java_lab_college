public class fibonacci {
    public static int fibb(int n){
        if(n==1 || n==0){
            return n;
        }
        int fnm1=fibb(n-1);
        int fnm2=fibb(n-2);

        int fib=fnm1+fnm2;
        return fib;
    }
    public static void main(String[] args) {
        System.out.println(fibb(3));
        
    }
    
}
