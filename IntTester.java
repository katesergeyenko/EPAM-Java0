public class IntTester {
    public static void testInt() {
        int a = 10;
        int b = 7;
        int c;

        //********************************************************************************
        System.out.println("\n***** Arithmetical Operators *****");

        //	addition
        c = a + b;
        System.out.printf("%d + %d = %d\n", a, b, c);

        //	subtraction
        c = a - b;
        System.out.printf("%d - %d = %d\n", a, b, c);

        // multiplication
        c = a * b;
        System.out.printf("%d * %d = %d\n", a, b, c);

        // division
        c = a / b;
        System.out.printf("%d / %d = %d\n", a, b, c);

        // modulus
        c = a % b;
        System.out.printf("%d %% %d = %d\n", a, b, c);

        a = 10;
        // unary minus
        c = -a;
        System.out.printf("-%d = %d\n", a, c);

        // unary plus
        c = +a;
        System.out.printf("+%d = %d\n", a, c);


        a = 10;
        // prefix increment
        System.out.printf("++%d = %d\n", a, ++a);


        a = 10;
        //	postfix increment
        System.out.printf("%d++ = %d\n", a, a++);

        a = 10;
        //	prefix decrement
        System.out.printf("--%d = %d\n", a, --a);

        a = 10;
        //	postfix decrement
        System.out.printf("%d-- = %d\n", a, a--);

        //********************************************************************************
        System.out.println("\n***** Bitwise Operators *****");

        // bitwise AND
        c = a & b;
        System.out.printf("%d & %d = %d\n", a, b, c);

        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));

        // bitwise OR
        c = a | b;
        System.out.printf("%d | %d = %d\n", a, b, c);

        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));


        // bitwise XOR
        c = a ^ b;
        System.out.printf("%d ^ %d = %d\n", a, b, c);

        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));

        // bitwise unary compliment
        c = ~a;
        System.out.printf("~%d = %d\n", a, c);

        System.out.println("in binary form:");
        System.out.printf("~%s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));


        // left shift
        c = a << 1;
        System.out.printf("%d << 1 = %d\n", a, c);

        System.out.println("in binary form:");
        System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        // right shift
        c = a >> 1;
        System.out.printf("%d >> 1 = %d\n", a, c);

        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        a = -10;
        // right shift
        c = a >> 1;
        System.out.printf("%d >> 1 = %d\n", a, c);

        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        a = 10;
        // zero fill right shift
        c = a >>> 1;
        System.out.printf("%d >>> 1 = %d\n", a, c);

        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        a = -10;
        // zero fill right shift
        c = a >>> 1;
        System.out.printf("%d >>> 1 = %d\n", a, c);

        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        //********************************************************************************
        System.out.println("\n***** Assignment Operators *****");

        c = 17;

        System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);

        System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
        System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);

        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);

        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);

        System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
        System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);

        System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);

        //********************************************************************************
        System.out.println("\n***** Relational Operators *****");

        // greater than
        System.out.printf("%d > %d --> %b\n", a, b, a > b);

        // greater than or equal to
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);

        // less than
        System.out.printf("%d < %d --> %b\n", a, b, a < b);

        // less than or equal to
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);

        // equal to
        System.out.printf("%d == %d --> %b\n", a, b, a == b);

        // not equal to
        System.out.printf("%d != %d --> %b\n", a, b, a != b);

        //********************************************************************************
        System.out.println("\n***** Logical Operations *****");

        // logical AND
        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a, (a > b) && (a > 0));

        // bitwise logical AND
        System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a, (a > b) & (a > 0));

        // logical OR
        System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));

        // bitwise logical OR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));

        // logical XOR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a >= b) ^ (b != 0));

        // logical NOT
        System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));

        //********************************************************************************
        System.out.println("\n***** Misc Operators *****");

        System.out.println("\n**Condition Operator:**");

        System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b, (a > b ? a : b));

        System.out.println("\n**Type Cast Operator:**");
        byte bt = 1;
        short sh = -32000;
        char ch = '\u0002';
        long l = 100000000000000000L;
        float f = 1.9f;
        double d = 123456789.625;

        c = bt;
        System.out.printf("int = byte: c = %d --> c = %d\n", bt, c);

        c = sh;
        System.out.printf("int = short: c = %d --> c = %d\n", sh, c);

        c = ch;
        System.out.printf("int = char: c = '%c' --> c = %d\n", ch, c);

        c = (int) l;
        System.out.printf("int = long: c = (int)%d --> c = %d\n", l, c);

        c = (int) f;
        System.out.printf("int = float: c = (int)%f --> c = %d\n", f, c);

        c = (int) d;
        System.out.printf("int = double: c = (int)%f --> c = %d\n", d, c);
    };
}
