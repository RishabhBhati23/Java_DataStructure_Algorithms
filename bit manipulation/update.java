 public class update{
 //Update ith Bit
    public static int updateIthBit(int n, int i, int val) {
        //Method1
         if(val == 0) {
            return n & (~(1<<i));
        } else {
             return n | (1<<i);
         }

        /*Method2
        n = clearIthBit(n, i);
        int bitMask = val<<i;
        return n | bitMask;*/
    }
     public static void main(String args[]) {
       System.out.println(updateIthBit(5,1,1));  
    }
}