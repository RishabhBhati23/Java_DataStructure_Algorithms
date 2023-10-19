public class printInc{
    public static void printinc(int n) {
        //base case
        if(n == 1) {
            System.out.println(n+" ");
            return;
        }
        
        printinc(n-1);
        System.out.print(n+" ");
        
    }
    
    
    public static void main(String args[])
    {
       int n=10;
       printinc(n);
    }
}    