
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		int childcount = 0;
		int boycount = 0;
		int girlcount= 0;
		boolean boyandgirl = false;
		while ( boyandgirl== false) {
			if (Math.random() < 0.5){
				boycount += 1;
				System.out.print("b ");
				}else{ 
				girlcount += 1;
				System.out.print("g ");}
		if( boycount >= 1 && girlcount >= 1){
			System.out.println();
			boyandgirl = true;
		}
		}
		System.out.println("You made it... and you now have " + (boycount + girlcount) + " children.");
	}
}
