public class Main
{
  public static void main(String[] args)
  {
      String str="AbstractMethodError";
      boolean isPalindrome=true;
      for(int i=0,j=str.length()-1;i<j;i++,j--){
          if(str.charAt(i)==str.charAt(j))
          continue;
         isPalindrome=false;
    break;
      }
      System.out.println(isPalindrome?"palindrome":"not palindrome");
  }}
