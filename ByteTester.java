public class ByteTester {
    public static void testByte() {
        byte a = 10;
        byte b = 7;
        byte c;

        //********************************************************************************
        System.out.println("\n***** Arithmetical Operators *****");

        //	addition
        c = (byte) (a + b);
        System.out.printf("%d + %d = %d\n", a, b, c);

        //	subtraction
        c = (byte) (a - b);
        System.out.printf("%d - %d = %d\n", a, b, c);

        // multiplication
        c = (byte) (a * b);
        System.out.printf("%d * %d = %d\n", a, b, c);

        // division
        c = (byte) (a / b);
        System.out.printf("%d / %d = %d\n", a, b, c);

        // modulus
        c = (byte) (a % b);
        System.out.printf("%d %% %d = %d\n", a, b, c);

        a = 10;
        // unary minus
        c = (byte) -a;
        System.out.printf("-%d = %d\n", a, c);

        // unary plus
        c = (byte) +a;
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
        c = (byte) (a & b);
        System.out.printf("%d & %d = %d\n", a, b, c);

        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));

        // bitwise OR
        c = (byte) (a | b);
        System.out.printf("%d | %d = %d\n", a, b, c);

        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));


        // bitwise XOR
        c = (byte) (a ^ b);
        System.out.printf("%d ^ %d = %d\n", a, b, c);

        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));

        // bitwise unary compliment
        c = (byte) ~a;
        System.out.printf("~%d = %d\n", a, c);

        System.out.println("in binary form:");
        System.out.printf("~%s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));


        // left shift
        c = (byte) (a << 1);
        System.out.printf("%d << 1 = %d\n", a, c);

        System.out.println("in binary form:");
        System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        // right shift
        c = (byte) (a >> 1);
        System.out.printf("%d >> 1 = %d\n", a, c);

        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        a = -10;
        // right shift
        c = (byte) (a >> 1);
        System.out.printf("%d >> 1 = %d\n", a, c);

        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        a = 10;

        // zero fill right shift
        c = (byte) (a >>> 1);
        System.out.printf("%d >>> 1 = %d\n", a, c);

        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        a = -10;
        // zero fill right shift
        c = (byte) (a >>> 1);
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
        short sh = -32000;
        char ch = '\u0002';
        int i = 2000000000;
        long l = 100000000000000000L;
        float f = 1.9f;
        double d = 123456789.625;

        c = (byte) sh;
        System.out.printf("byte = short: c = %d --> c = %d\n", sh, c);

        c = (byte) ch;
        System.out.printf("byte = char: c = '%c' --> c = %d\n", ch, c);

        c = (byte) i;
        System.out.printf("byte = int: c = '%d' --> c = %d\n", i, c);

        c = (byte) l;
        System.out.printf("byte = long: c = %d --> c = %d\n", l, c);

        c = (byte) f;
        System.out.printf("byte = float: c = %f --> c = %d\n", f, c);

        c = (byte) d;
        System.out.printf("byte = double: c = %f --> c = %d\n", d, c);
    };
}
