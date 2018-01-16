package Chapter6;
import java.util.Scanner;
/**
 * Money conversion program.
 *
 * @author Ryan Lykins
 */
public class P6 
{
       /**
     * Main Method
     *
     * @param args to accept the conversion rates and amount to be converted. Then display it. 
     */
    public static void main(String[] args)
    {
    double euroValue;
    double poundValue;
    double yenValue;
    boolean stopLoop = false;
    double convAmount;
    double postConv;
    String currType;
    double servCharge;
    String YorN;
    boolean done = false;
    Scanner input = new Scanner(System.in);
    
    System.out.print("How many Euros does a dollar buy? : ");
    euroValue = input.nextDouble();
    
    System.out.print("How many Pound Sterling does a dollar buy? : ");
    poundValue = input.nextDouble();
    
    System.out.print("How many Yen does a dollar buy? : ");
    yenValue = input.nextDouble();
    
    while(stopLoop == false)
    {
    System.out.print("Please enter the number of dollars you want to convert: ");
    convAmount = input.nextDouble();
    
    System.out.print("Enter \"E\" to buy Euros, \"P\" to buy Pounds or \"Y\" to buy Yen: ");
    currType = input.next();
    
    if("E".equals(currType) || "e".equals(currType))
        {
            System.out.print("Your $"+convAmount+" in euros: "+ calcCurr(convAmount, euroValue));
            done = true;
        }
    
    if("P".equals(currType) || "p".equals(currType))
        {
            System.out.print("Your $"+convAmount+" in euros: "+ calcCurr(convAmount, poundValue));
            done = true;
        }
    if("Y".equals(currType) || "y".equals(currType))
        {
            System.out.print("Your $"+convAmount+" in euros: "+ calcCurr(convAmount, yenValue));
            done = true;
        }
    while(done == true)
    {
           System.out.println(" Would you like to convert again? Y or N");
    YorN = input.next();
    if ("Y".equals(YorN) || "y".equals(YorN))
        {
            stopLoop = false;
            done = false;
        }
    if("N".equals(YorN) || "n".equals(YorN))
        {
            stopLoop = true;
            System.exit(0);
        }
    }   
    
    }
    }
       /**
     * calcCurr Method
     *
     * @return num1,num2 to calculate how much the conversion company will take. 
     */
  public static double calcCurr(double num1, double num2)
  {
  double num3 = num2*num1;
  if(num3 > 100)
            {
            num3 = num3 - (num3*.05);
            }
            else if(num3 <= 100)
            {
            num3 = num3 - (num3*.1);
            }
  return num3;
  }
}
