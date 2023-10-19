public class getBit{
    //Get ith Bit
    public static int getIthBit(int n, int i) {
        int bitMask = 1<<i;
        return (n & bitMask) == 0 ? 0 : 1;
    }
     public static void main(String args[]) {
       System.out.println(getIthBit(5,1));  
    }
}