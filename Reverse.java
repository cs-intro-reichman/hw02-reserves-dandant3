/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		//// Put your code here
		String a = args[0];
		String b = "";
		for(int i = 0; i < a.length(); i++){
			b = b + a.charAt((a.length()-1)- i);
			}
		char c = a.charAt((b.length()-1)/2 );
		System.out.println(b);
		System.out.println("The middle character is " + c);
	}
}