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
        if(n > m) {
            return n;
        }

        return print1ToN(n,m);
    }

    static int sumNNumbers(int n, int m) {
        n += m;
        if (m <= 1) {
            return n;
        }
        return sumNNumbers(n, m-1);
    }

    public static void main(String args[]) {
        // ? using recursion, printing n numbers
        // printNNumbers(10);

        //? printing name using recursion
        // printNNames(5, "devankarpit"); 
        
        //? printing 1 to N
        print1ToN(1,10);

        //? sum of n numbers
        System.out.println(sumNNumbers(0, 10));

    }
}
