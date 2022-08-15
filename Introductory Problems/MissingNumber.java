import java.util.*;

class MissingNumber {

	public static void main(String[] args) {
		// O(N) Time | O(N) Space
		// read the input 
		Scanner scanner = new Scanner(System.in);
		long n = scanner.nextLong();
		long count = n;
		// hashmap to store the elements and then we can look up in constant time or O(1)
		HashMap<Long,Long> hashmap = new HashMap<Long,Long>();
		while(n > 1) {
			long num = scanner.nextLong();
			// store all the numbers into the hashmap
			hashmap.put(num,num);
			n--;
		}
		scanner.close();
		for(long i=1; i<=count; i++) {
			if(hashmap.containsKey(i) == true) continue;
			else {
				System.out.println(i);
				break;
			}
		}

	}	

}

