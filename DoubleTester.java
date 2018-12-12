public class DoubleTester {
    public static void testDouble() {
        double a = 10.;
        double b = 7.;
        double c;

        //********************************************************************************
        System.out.println("\n***** Arithmetical Operators *****");

        //	addition
        c = a + b;
        System.out.printf("%f + %f = %f\n", a, b, c);

        //	subtraction
        c = a - b;
        System.out.printf("%f - %f = %f\n", a, b, c);

        // multiplication
        c = a * b;
        System.out.printf("%f * %f = %f\n", a, b, c);

        // division
        c = a / b;
        System.out.printf("%f / %f = %f\n", a, b, c);

        // modulus
        c = a % b;
        System.out.printf("%f %% %f = %f\n", a, b, c);

        a = 10.;
        // unary minus
        c = -a;
        System.out.printf("-%f = %f\n", a, c);

        // unary plus
        c = +a;
        System.out.printf("+%f = %f\n", a, c);


        a = 10.;
        // prefix increment
        System.out.printf("++%f = %f\n", a, ++a);


        a = 10.;
        //	postfix increment
        System.out.printf("%f++ = %f\n", a, a++);

        a = 10.;
        //	prefix decrement
        System.out.printf("--%f = %f\n", a, --a);

        a = 10.;
        //	postfix decrement
        System.out.printf("%f-- = %f\n", a, a--);

        //********************************************************************************
        System.out.println("\n***** Assignment Operators *****");

        c = 17.;

        System.out.printf("%f += %f --> c = %f\n", c, a, c += a);
        System.out.printf("%f -= %f --> c = %f\n", c, a, c -= a);

        System.out.printf("%f *= %f --> c = %f\n", c, a, c *= a);
        System.out.printf("%f /= %f --> c = %f\n", c, a, c /= a);
        System.out.printf("%f %%= %f --> c = %f\n", c, a, c %= a);

        //********************************************************************************
        System.out.println("\n***** Relational Operators *****");

        // greater than
        System.out.printf("%f > %f --> %b\n", a, b, a > b);

        // greater than or equal to
        System.out.printf("%f >= %f --> %b\n", a, b, a >= b);

        // less than
        System.out.printf("%f < %f --> %b\n", a, b, a < b);

        // less than or equal to
        System.out.printf("%f <= %f --> %b\n", a, b, a <= b);

        // equal to
        System.out.printf("%f == %f --> %b\n", a, b, a == b);

        // not equal to
        System.out.printf("%f != %f --> %b\n", a, b, a != b);

        //********************************************************************************
        System.out.println("\n***** Logical Operations *****");

        // logical AND
        System.out.printf("(%f > %f) && (%f > 0) --> %b\n", a, b, a, (a > b) && (a > 0));

        // bitwise logical AND
        System.out.printf("(%f > %f) & (%f > 0) --> %b\n", a, b, a, (a > b) & (a > 0));

        // logical OR
        System.out.printf("(%f >= %f) || (%f != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));

        // bitwise logical OR
        System.out.printf("(%f >= %f) | (%f != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));

        // logical XOR
        System.out.printf("(%f >= %f) | (%f != 0) --> %b\n", a, b, b, (a >= b) ^ (b != 0));

        // logical NOT
        System.out.printf("!(%f >= %f) --> %b\n", a, b, !(a >= b));

        //********************************************************************************
        System.out.println("\n***** Misc Operators *****");

        System.out.println("\n**Condition Operator:**");

        System.out.printf("%f > %f ? %f : %f --> %f\n", a, b, a, b, (a > b ? a : b));

        System.out.println("\n**Type Cast Operator:**");
        byte bt = 1;
        short sh = -32000;
        char ch = '\u0002';
        int i = 2000000000;
        long l = 100000000000000000L;
        float f = 1.9f;

        c = bt;
        System.out.printf("double = byte: c = %d --> c = %f\n", bt, c);

        c = sh;
        System.out.printf("double = short: c = %d --> c = %f\n", sh, c);

        c = ch;
        System.out.printf("double = char: c = '%c' --> c = %f\n", ch, c);

        c = i;
        System.out.printf("double = int: c = %d --> c = %f\n", i, c);

        c = l;
        System.out.printf("double = long: c = %d --> c = %f\n", l, c);

        c = f;
        System.out.printf("double = float: c = %f --> c = %f\n", f, c);
    };
}
