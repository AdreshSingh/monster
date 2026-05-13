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
        if (number <= 0)
            System.out.println("-1");

        int reversed = 0;
        int remainder = 0;
        while (number > 0) {
            remainder = number % 10;
            reversed = reversed * 10 + remainder;
            number /= 10;
        }

        System.out.println(reversed);
    }

    static void palindromeNumber(int num) {
        int temp = num;
        int rev = 0;
        while (temp > 0) {
            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        if (rev == num)
            System.out.println("Palindrome Number");
        else
            System.out.println("Not Palindrome Number");
    }

    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        if (a > b) {
            return gcd(b, a % b);
        }
        return gcd(a, b % a);
    }

    static void armstrong(int num) {
        int temp = num;
        int arms = 0;

        while (temp > 0) {
            int rev = temp % 10;
            arms = arms + (rev * rev * rev);
            temp /= 10;
        }

        System.out.println(arms == num ? "Armstrong number" : "not Armstrong number");
    }

    static int checkPrime(int num) {
        if (num <= 1)
            return 0;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return 0;
            }
        }
        return 1;
    }

    static void printDivisors(int num) {
        for(int i=1; i<= num; i++) {
            if(num % i ==0){
                System.out.print(" "+ i);
            }
        }
    }

    public static void main(String[] args) {
        // ? digicount
        // numberCountArray(123445);
        // numberCountMap(123445);

        // ? reverseNumber
        // reverseNumber(12345);

        // ? palindrome number
        // palindromeNumber(121);

        // ? GCD for two numbers
        // System.out.println(gcd(12, 18));

        // ? armstrong number
        // armstrong(153);

        //? check prime
        // System.out.println(checkPrime(5) == 1 ? "Yes, a Prime num" : "Not, a Prime num");

        //? print divisors
        // printDivisors(12);
    }
}
