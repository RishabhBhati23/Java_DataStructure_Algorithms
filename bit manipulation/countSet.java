public class countSet{
//Count number of set bits
    public static int countSetBits(int n) {
        int setBits = 0;
        int bitMask = 1;
        while(n != 0) {
            if((n & bitMask) != 0) { //last bit is 1
                setBits++;
            }
            n = n>>1;
        }
        return setBits;
    }
    public static void main(String args[]) {
       System.out.println(countSetBits(15));  
    }
}
