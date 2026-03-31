import java.util.HashMap;

public class BasicMath {

    static void numberCountArray(int number) {
        int arr[] = new int[10];
        int remainder;
        while (number > 0) {
            remainder = number % 10;
            arr[remainder]++;
            number = number / 10;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                System.out.println(i + " " + arr[i]);
            }
        }
    }

    static void numberCountMap(int number) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int remainder = 0;

        while (number > 0) {
            remainder = number % 10;
            if (!map.containsKey(remainder)) {
                map.put(remainder, 1);
            } else {
                map.put(remainder, map.get(remainder) + 1);
            }
            number /= 10;
        }

        System.out.print(map.toString());
    }

    static void reverseNumber(int number) {
        if (number <= 0) System.out.println("-1");

        int reversed = 0;
        int remainder=0;
        while (number > 0) {
            remainder = number % 10;
            reversed = reversed * 10 + remainder;
            number /= 10;
        }

        System.out.println(reversed);
    }

    static void palindromeNumber(int num) {
        int temp = num;
        int rev=0;
        while(temp > 0) {
            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        if(rev == num) System.out.println("Palindrome Number");
        else System.out.println("Not Palindrome Number");
    }

    static void gcd(int a, int b) {
        
    }
    public static void main(String[] args) {
        // ? digicount
        // numberCountArray(123445);
        // numberCountMap(123445);

        //? reverseNumber
        // reverseNumber(12345);

        //? palindrome number
        palindromeNumber(121);
    }
}
