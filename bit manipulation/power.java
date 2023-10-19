public class power{
//Check if number is power of 2 or not
    public static boolean isPowerof2(int n) {
        return (n & (n-1)) == 0;
    }
    public static void main(String args[]) {
       System.out.println(isPowerof2(256));  
    }
}