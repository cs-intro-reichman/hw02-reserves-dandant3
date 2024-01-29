/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		int T = Integer.parseInt(args[0]);
		int childcount = 0;
		int sum = 0;
		int f2 = 0;
		int f3 = 0;
		int f4 = 0;

		for (int t = 0; t < T; t++) {
			int boycount = 0;
			int girlcount = 0;
			boolean boyandgirl = false;
			while ( boyandgirl== false) {
			if (Math.random() < 0.5){
				boycount += 1;
				}else{ 
					girlcount += 1;}
			if( boycount >= 1 && girlcount >= 1){
			boyandgirl = true;
			sum += boycount + girlcount;
				if( boycount + girlcount == 2){
				f2 += 1;}
				if( boycount + girlcount == 3){
				f3 += 1;}
				if( boycount + girlcount > 3){
				f4 += 1;}

			}
		}
	}
	double average = (double)sum/ T;
	System.out.println("Average: " + average + " children to get at least one of each gender.");
	System.out.println("Number of families with 2 children: " + f2);
	System.out.println("Number of families with 3 children: " + f3);
	System.out.println("Number of families with 4 or more children: " + f4);
	}
}