/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter7;
import java.util.Scanner;
/**
 *
 * @author kl0977133
 */
public class C7_9 {
    public static void main(String[] args) {
    System.out.print("Enter ten numbers please :");
  Scanner input = new Scanner(System.in);
  double[] num = new double[10];
 
  for (int i = 0; i < num.length; i++) {
   num[i] = input.nextDouble();
  }
 
  System.out.println("The minimum number is: " + min(num));
 }
 
 public static double min(double[] array) {
 
  double min = array[0];
 
  for (int i = 1; i < array.length; i++) {
   if (min > array[i]) {
    min = array[i];
   }
  }
 
  return min;
 
 }

}
