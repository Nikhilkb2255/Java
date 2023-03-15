import java.util.*;
class pali
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = s.next(), revstr = "";      
        int strLength = str.length();  
        for(int i=(strLength - 1);i >=0;--i)
        {
        revstr = revstr + str.charAt(i);
        }

      if(str.equals(revstr))
      {
        System.out.println(str + " is Palindrome");
      }
      else
      {
        System.out.println(str + " is not Palindrome");
      }
    }
  }