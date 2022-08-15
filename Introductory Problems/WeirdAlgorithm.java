import java.util.*;


class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        // int is 32 bit and long is 64 bits 
        scanner.close();
        System.out.print(n + " ");
        while(n > 1){
            if(n%2 == 0) n = n / 2;
            else n = (n * 3) + 1;
            System.out.print(n + " ");
        }
    }
}
