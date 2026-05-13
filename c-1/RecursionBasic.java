import java.util.Arrays;

public class RecursionBasic {
    static int printNNumbers(int n) {
        System.out.println(n);
        if (n <= 0) {
            return 1;
        }
        return printNNumbers(n - 1);
    }

    static int printNNames(int n, String name) {
        System.out.println(name);
        if (n <= 0) {
            return 1;
        }
        return printNNames(n - 1, name);
    }

    static int print1ToN(int n, int m) {
        System.out.println(n);
        n += 1;
        if (n > m) {
            return n;
        }

        return print1ToN(n, m);
    }

    static int sumNNumbers(int n, int m) {
        n += m;
        if (m <= 1) {
            return n;
        }
        return sumNNumbers(n, m - 1);
    }

    static int factorial(int n) {
        if (n <= 0) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    // ! Recersing an array
    static void reverse(int arr[], int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    static int[] reverseArray(int arr[], int left, int right) {
        if (left == arr.length / 2) {
            return arr;
        }
        reverse(arr, left, right);
        return reverseArray(arr, left + 1, right - 1);
    }

    // ! Checking for palindrome string
    static void reverseStr(char[] arr, int left, int right) {
        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    static char[] createReverseString(char[] arr, int left, int right) {
        if (left == arr.length / 2) {
            return arr;
        }
        reverseStr(arr, left, right);

        return createReverseString(arr, left + 1, right - 1);
    }

    static void checkPalindrome(String str) {
        char[] arr = str.toCharArray();
        String reverse = new String(createReverseString(arr, 0, str.length() - 1));
        if (str.equals(reverse)) {
            System.out.println("Yes it is palindrome");
        } else {
            System.out.println("No, it is not a palindrome");
        }
    }

    //? fibonacci
    static int fibonacci(int count, int a, int b) {
        int c = a + b;
        if (count <= 0) {
            return c;
        }

        System.out.println("fib: " + c);
        return fibonacci(count-1, b, c);
    }

    public static void main(String args[]) {
        // ? using recursion, printing n numbers
        // printNNumbers(10);

        // ? printing name using recursion
        // printNNames(5, "devankarpit");

        // ? printing 1 to N
        // print1ToN(1,10);

        // ? sum of n numbers
        // System.out.println(sumNNumbers(0, 10));

        // ? factorial
        // System.out.println(factorial(5));

        // ? reversing an array
        // System.out.println(Arrays.toString(reverseArray(new int[] { 1, 2, 3, 4 }, 0, 3)));
        // System.out.println(Arrays.toString(reverseArray(new int[] { 1, 2, 3, 4, 5 }, 0, 4)));

        //? checking for palindrome
        // checkPalindrome("mom");
        // checkPalindrome("dev");

        //? fibonacci 
        int numberOfSeries = 5;
        System.out.println("fib: 0\nfib: 1");
        fibonacci(numberOfSeries - 2, 0, 1);

    }
}
