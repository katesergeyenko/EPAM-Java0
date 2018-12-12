public class BooleanTester {
    public static void testBoolean() {
        boolean a = true;
        boolean b = false;
        boolean c;

        //********************************************************************************
        System.out.println("\n***** Bitwise Operators *****");

        // bitwise AND
        c = a & b;
        System.out.printf("%b & %b = %b\n", a, b, c);

        // bitwise OR
        c = a | b;
        System.out.printf("%b | %b = %b\n", a, b, c);

        // bitwise XOR
        c = a ^ b;
        System.out.printf("%b ^ %b = %b\n", a, b, c);

        //********************************************************************************
        System.out.println("\n***** Assignment Operators *****");

        c = false;

        System.out.printf("%b |= %b --> c = %b\n", c, a, c |= a);
        System.out.printf("%b &= %b --> c = %b\n", c, a, c &= a);

        System.out.printf("%b ^= %b --> c = %b\n", c, a, c ^= a);

        //********************************************************************************
        System.out.println("\n***** Relational Operators *****");

        System.out.printf("%b == %b --> %b\n", a, b, a == b);

        // not equal to
        System.out.printf("%b != %b --> %b\n", a, b, a != b);

        //********************************************************************************
        System.out.println("\n***** Logical Operations *****");

        // logical AND
        System.out.printf("%b && %b --> %b\n", a, b, a && b);

        // bitwise logical AND
        System.out.printf("%b & %b --> %b\n", a, b, a & b);

        // logical OR
        System.out.printf("%b || %b --> %b\n", a, b, a || b);

        // bitwise logical OR
        System.out.printf("%b | %b --> %b\n", a, b, a | b);

        // logical XOR
        System.out.printf("%b | %b --> %b\n", a, b, a ^ b);

        // logical NOT
        System.out.printf("!%b  --> %b\n", a, !a);

        //********************************************************************************
        System.out.println("\n***** Misc Operators *****");

        System.out.println("\n**Condition Operator:**");

        System.out.printf("%b ? %b : %b --> %b\n", c, a, b, (c ? a : b));
    };
}
