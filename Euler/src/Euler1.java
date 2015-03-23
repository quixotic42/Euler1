public class Euler1 {
	int sum = 0;
	static int three = 0;
	static int five = 0;
	int union = 0;

	public int get3() {

		// If we list all the natural numbers below 10 that are multiples of 3
		// or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
		// Find the sum of all the multiples of 3 or 5 below 1000.

		for (int i = 1; i < 1001; i++) {
			if (i % 3 == 0) {
				three = three + i;
			}
		}
		return three;
	}
		public int get5() {
		for (int i = 1; i < 1001; i++) {
			if (i % 5 == 0) {
				five = five + i;
			}
			
		}
		return five;
		}
		
		public int union(){
		for (int i = 1; i < 1001; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				union = union + i;
			}
		}
		return union;
		}
		
		public void eulerOutput(int three, int five, int union){
		sum = three + five - union;
		System.out.println("Sum:" + sum);
		System.out.println("Sum of Threes:" + three);
		System.out.println("Sum of Fives" + five);
		System.out.println("Union" + union);
	}
}