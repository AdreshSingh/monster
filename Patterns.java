class Patterns {
    static void simpleSquare() {
        for (int i = 0; i < 5; i++) {
            System.out.println("*****");
        }
    }

    static void simepleRightTriangle() {
        for (int i = 0; i < 5; i++) {
            System.out.println("*".repeat(i));
        }
    }

    static void simepleNumericalRightTriangle() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1);
            }
            System.out.println();
        }
    }

    static void simepleRepeatedNumericalRightTriangle() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(i + 1);
            }
            System.out.println();
        }
    }

    static void simpleReverseTriangle() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < (5 - i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void simpleReverseNumericTriangle() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < (5 - i); j++) {
                System.out.print(j + 1);
            }
            System.out.println();
        }
    }

    static void simpleTriangle(int lines) {
        for (int i = 0; i < lines; i++) {
            for (int sp1 = 0; sp1 < (lines - i); sp1++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void simpleReverseTriangle(int lines) {
        for (int i = 0; i < lines; i++) {
            for (int sp1 = 0; sp1 < i; sp1++) {
                System.out.print(" ");
            }

            for (int j = 0; j < lines - i; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < lines - i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void wierdTriangle(int lines) {
        int count = 0;
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < (i > 5 ? i - count++ : i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void binaryRightTraingle(int lines) {
        int value = 1;
        for (int i = 0; i <= lines; i++) {
            value = i % 2 == 0 ? 0:1;
            for (int j = 0; j < i; j++) {
                System.out.print(value);

                value = value == 1 ? value - 1 : value + 1;

            }
            System.out.println();
        }
    }

    static void numericCastle(int lines) {
        for(int i=1; i < lines; i++){
            for (int j = 0; j < i; j++) {
                System.out.print(j+1);
            }

            for(int j=0; j<= (lines - (i-1)*2); j++){
                System.out.print("-");
            }


            for (int j = i ; j > 0; j--) {
                System.out.print(j);
            }

            System.out.println();
        }
    }

    static void regularTriangle(int lines) {
        int c=0;
        for(int i = 0; i<= lines; i++){
            for(int j=0; j<i; j++){
                c++;
                System.out.print(" "+c+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // ? p-1
        // simpleSquare();

        // ? p-2
        // simepleRightTriangle();

        // ? p-3
        // simepleNumericalRightTriangle();

        // ? p-4
        // simepleRepeatedNumericalRightTriangle();

        // ? p-5
        // simpleReverseTriangle();

        // ? p-6
        // simpleReverseNumericTriangle();

        // ? p-7
        // simpleTriangle(10);

        // ? p-8
        // simpleReverseTriangle(10);

        // ? p-9 combining only - so no need for new code
        // simpleTriangle(10);
        // simpleReverseTriangle(10);

        // ? p-10 well
        // wierdTriangle(10);

        //? p-11
        // binaryRightTraingle(5);

        //! p-12 -- pretty hard -- need to learn -- done somehow
        // numericCastle(5);

        //? p-13
        regularTriangle(5);

    }
}