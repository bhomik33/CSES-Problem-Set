import java.util.*;

class Repitition {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String seq = scanner.next();
		scanner.close();
		long count = 1;
		long maxCount = 1;
		// start from the character one and then check if char[i] == char[i+1]
		// if it is equal increment the count
		// if not equal then reset the count and start counting again for the max repitition
		for(int i=0; i < seq.length()-1;i++){
			if(seq.charAt(i) == seq.charAt(i+1)) count++;
			else {
				count = 1;
			}
			maxCount = Math.max(maxCount, count);
		}
		System.out.println(maxCount);


	}
}
