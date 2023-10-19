 public class rangeClear{
 //Clear Bits in Range (i,j)
    public static int clearBitsinRange(int n, int i, int j) {
        int a = ~0<<i;
        int b = (1<<i)-1;
        int bitMask = a | b;
        return n & bitMask;
    }
     public static void main(String args[]) {
       System.out.println(clearBitsinRange(10,2,4));  
    }
}