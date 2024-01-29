/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int i = 0;
		// iterate through square rows
		while (i < n) {
			// iterate through square columns
			int j = 0;
			while (j < n) {
				System.out.print("*");
				j++;
				System.out.print(" ");
			}
			if(i% 2==0){
				System.out.print("\n ");
			}else{
				System.out.println(" ");}
			i++;
		}
	}
}