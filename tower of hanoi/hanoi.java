import java.util.*;
public class hanoi {
    public static int Hanoi(int disk,int source,int dest,int aux)
    {
        if(disk==1)
        {
            System.out.println(source+"to"+dest);
        }
        else{
            //step1
            Hanoi(disk-1,source,aux,dest);
            //step2
            System.out.println(source+"+"+dest);
            //step3
            Hanoi(disk-1,aux,dest,source);
        }
    }
    public static void main(String args[]){
        System.out.println("no of step"+Hanoi(4,1,2,3));
        return ;
    }
}
