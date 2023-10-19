public class clearLast{
//Clear Last i Bits
    public static int clearLastIbits(int n, int i) {
        int bitMask = (~0)<<i; // or (-1)<<i
        return n | bitMask;
    }

    public static void main(String args[])
    {
        System.out.println(clearLastIbits(5,3));
    }

}