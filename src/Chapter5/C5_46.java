package Chapter5;
import java.util.Scanner;


public class C5_46 
{
    public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  
  System.out.print("Enter a string:");
  String s = input.nextLine();
  String s2 = "";
 
  for (int x = s.length() - 1; x >= 0; x--) {
   s2 += s.charAt(x);
 
  }
 
  System.out.println("The reversed string is " + s2);
 
 }

}
