package Chapter6;
import java.util.Scanner;
/**
 * Program to show if password is valid.
 *
 * @author Ryan Lykins
 */
public class C6_18 
{
       /**
     * Main Method
     *
     * @param args to accept the user password and see if its valid. 
     */
    public static void main(String[] args) 
{
		Scanner input = new Scanner(System.in); 

		System.out.print("Enter a password: ");
		String password = input.nextLine();

		System.out.println(
			(isValidPassword(password) ? "Valid " : "Invalid ") + "Password");
}
   /**
     * Main Method
     *
     * @param Boolean To see if password is valid. 
     */
	public static boolean isValidPassword(String password) 
{
		final int LENGTH_OF_VALID_PASSWORD = 8;		  
 final int MINIMUM_NUMBER_OF_DIGITS = 2;	

		boolean validPassword = 
			isLengthValid(password, LENGTH_OF_VALID_PASSWORD) && 
			isOnlyLettersAndDigits(password) &&
			hasNDigits(password, MINIMUM_NUMBER_OF_DIGITS);

		return validPassword;
	}
   /**
     * Main Method
     *
     * @param Boolean to see if the length is valid on the password. 
     */
		public static boolean isLengthValid(String password, int validLength) 
{
		return password.length() >= validLength;
	}
   /**
     * Main Method
     *
     * @param Boolean to see if there are only letters and digits in password. 
     */
	public static boolean isOnlyLettersAndDigits(String password) 
{
		for (int i = 0; i < password.length(); i++) {
			if (!Character.isLetterOrDigit(password.charAt(i))) 
{
				return false;
			}
		}
		return true;
	}
   /**
     * Main Method
     *
     * @param Boolean to see if the password has no digits. 
     */
		public static boolean hasNDigits(String password, int n) {
		int numberOfDigits = 0;
		for (int x = 0; x < password.length(); x++) {
			if (Character.isDigit(password.charAt(x))) {
				numberOfDigits++;
			}
			if (numberOfDigits >= n) {
				return true;
			}
		}
		return false;
	}

}
