/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		int Ten = 11;
		int prenum = 0;
		int num = ((int)(Math.random()* Ten));
		System.out.println(num);
		do{
			prenum= num;
			num = ((int)(Math.random()* Ten));
			if( num >= prenum){
				System.out.println(num);
			}
		}while ( prenum <= num) ;
			
	}
}