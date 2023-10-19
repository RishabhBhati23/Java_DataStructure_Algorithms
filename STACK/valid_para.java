import java.util.*;

public class valid_para{
    public static boolean isValid(String str)
    {
       Stack<Character> s=new Stack<>();

       for(int i=0;i<str.length();i++)
       {
          char ch=str.charAt(i);

          if(ch=='('||ch=='{'||ch=='[')//opening brackets
          {
            s.push(ch);
          }
          else{
            //closing
            if(s.isEmpty())
            {
                return false;
            }
            if((s.peek()=='(' && ch==')')//()
            ||(s.peek()=='{' && ch=='}')//{}
            ||(s.peek()=='[' && ch==']'))//[]
            {
               s.pop();
            }
            else
            {
                return false;
            }
          }
         
       }
        if(s.isEmpty())
          {
            return true;
          }
          else{
            return false;
          }
    }
    public static void main(String args[])
    //O(n)
    {
        String str="(({})[]";//true

        System.out.println(isValid(str));
    }
}