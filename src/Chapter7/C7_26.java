
package Chapter7;
import java.util.Scanner;
/**
 * Program that sees if two lists are identical.
 *
 * @author Ryan Lykins
 */
public class C7_26 {
    /**
     * Main Method
     * @param args - Sees if lists are the same. 
     */
     public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
 
  System.out.print("Enter list1:");
  int[] list1 = new int[input.nextInt()];
  for (int i = 0; i < list1.length; i++) {
   list1[i] = input.nextInt();
  }
 
  System.out.print("Enter list2:");
  int[] list2 = new int[input.nextInt()];
  for (int i = 0; i < list2.length; i++) {
   list2[i] = input.nextInt();
  }
 
  if (equals(list1, list2)) {
   System.out.println("the two lists are identical");
  } else {
   System.out.println("The two lists are not identical");
  }
 
 }
 /**
  * equals Method 
  * @param list1 - first list entered.
  * @param list2 - Second list entered.
  * @return - true or false if they are same. 
  */
 public static boolean equals(int[] list1, int[] list2) {
 
  if (list1.length != list2.length)
   return false;
 
  for (int i = 0; i < list2.length; i++) {
   if (list1[i] != list2[i])
    return false;
  }
 
  return true;
 
 }

}
