public class CharTester {
    public static void testChar() {
        char a = '\u006b';
        char b = '\u0073';
        char c;

        //********************************************************************************
        System.out.println("\n***** Arithmetical Operators *****");

        //	addition
        c = (char) (a + b);
        System.out.printf("%c + %c = %c\n", a, b, c);

        //	subtraction
        c = (char) (a - b);
        System.out.printf("%c - %c = %c\n", a, b, c);

        // multiplication
        c = (char) (a * b);
        System.out.printf("%c * %c = %c\n", a, b, c);

        // division
        c = (char) (a / b);
        System.out.printf("%c / %c = %c\n", a, b, c);

        // modulus
        c = (char) (a % b);
        System.out.printf("%c %% %c = %c\n", a, b, c);

        a = '\u006b';
        // unary minus
        c = (char) -a;
        System.out.printf("-%c = %c\n", a, c);

        // unary plus
        c = (char) +a;
        System.out.printf("+%c = %c\n", a, c);


        a = '\u006b';
        // prefix increment
        System.out.printf("++%c = %c\n", a, ++a);


        a = '\u006b';
        //	postfix increment
        System.out.printf("%c++ = %c\n", a, a++);

        a = '\u006b';
        //	prefix decrement
        System.out.printf("--%c = %c\n", a, --a);

        a = '\u006b';
        //	postfix decrement
        System.out.printf("%c-- = %c\n", a, a--);

        //********************************************************************************
        System.out.println("\n***** Bitwise Operators *****");

        // bitwise AND
        c = (char) (a & b);
        System.out.printf("%c & %c = %c\n", a, b, c);

        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));

        // bitwise OR
        c = (char) (a | b);
        System.out.printf("%c | %c = %c\n", a, b, c);

        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));


        // bitwise XOR
        c = (char) (a ^ b);
        System.out.printf("%c ^ %c = %c\n", a, b, c);

        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));

        // bitwise unary compliment
        c = (char) ~a;
        System.out.printf("~%c = %c\n", a, c);

        System.out.println("in binary form:");
        System.out.printf("~%s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));


        // left shift
        c = (char) (a << 1);
        System.out.printf("%c << 1 = %c\n", a, c);

        System.out.println("in binary form:");
        System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        // right shift
        c = (char) (a >> 1);
        System.out.printf("%c >> 1 = %c\n", a, c);

        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        a = '\u006b';
        // zero fill right shift
        c = (char) (a >>> 1);
        System.out.printf("%c >>> 1 = %c\n", a, c);

        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        //********************************************************************************
        System.out.println("\n***** Assignment Operators *****");

        c = '\u006c';

        System.out.printf("%c += %c --> c = %c\n", c, a, c += a);
        System.out.printf("%c -= %c --> c = %c\n", c, a, c -= a);

        System.out.printf("%c *= %c --> c = %c\n", c, a, c *= a);
        System.out.printf("%c /= %c --> c = %c\n", c, a, c /= a);
        System.out.printf("%c %%= %c --> c = %c\n", c, a, c %= a);

        System.out.printf("%c |= %c --> c = %c\n", c, a, c |= a);
        System.out.printf("%c &= %c --> c = %c\n", c, a, c &= a);

        System.out.printf("%c ^= %c --> c = %c\n", c, a, c ^= a);

        System.out.printf("%c >>= 1 --> c = %c\n", c, c >>= 1);
        System.out.printf("%c <<= 1 --> c = %c\n", c, c <<= 1);

        System.out.printf("%c >>>= 1 --> c = %c\n", c, c >>>= 1);

        //********************************************************************************
        System.out.println("\n***** Relational Operators *****");

        // greater than
        System.out.printf("%c > %c --> %b\n", a, b, a > b);

        // greater than or equal to
        System.out.printf("%c >= %c --> %b\n", a, b, a >= b);

        // less than
        System.out.printf("%c < %c --> %b\n", a, b, a < b);

        // less than or equal to
        System.out.printf("%c <= %c --> %b\n", a, b, a <= b);

        // equal to
        System.out.printf("%c == %c --> %b\n", a, b, a == b);

        // not equal to
        System.out.printf("%c != %c --> %b\n", a, b, a != b);

        //********************************************************************************
        System.out.println("\n***** Logical Operations *****");

        // logical AND
        System.out.printf("(%c > %c) && (%c > 0) --> %b\n", a, b, a, (a > b) && (a > 0));

        // bitwise logical AND
        System.out.printf("(%c > %c) & (%c > 0) --> %b\n", a, b, a, (a > b) & (a > 0));

        // logical OR
        System.out.printf("(%c >= %c) || (%c != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));

        // bitwise logical OR
        System.out.printf("(%c >= %c) | (%c != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));

        // logical XOR
        System.out.printf("(%c >= %c) | (%c != 0) --> %b\n", a, b, b, (a >= b) ^ (b != 0));

        // logical NOT
        System.out.printf("!(%c >= %c) --> %b\n", a, b, !(a >= b));

        //********************************************************************************
        System.out.println("\n***** Misc Operators *****");

        System.out.println("\n**Condition Operator:**");

        System.out.printf("%c > %c ? %c : %c --> %c\n", a, b, a, b, (a > b ? a : b));

        System.out.println("\n**Type Cast Operator:**");
        byte bt = 1;
        short sh = -32000;
        int i = 2000000000;
        long l = 100000000000000000L;
        float f = 1.9f;
        double d = 123456789.625;

        c = (char) bt;
        System.out.printf("char = byte: c = %d --> c = %c\n", bt, c);

        c = (char) sh;
        System.out.printf("char = short: c = %d --> c = %c\n", sh, c);

        c = (char) i;
        System.out.printf("char = int: c = '%d' --> c = %c\n", i, c);

        c = (char) l;
        System.out.printf("char = long: c = %d --> c = %c\n", l, c);

        c = (char) f;
        System.out.printf("char = float: c = %f --> c = %c\n", f, c);

        c = (char) d;
        System.out.printf("char = double: c = %f --> c = %c\n", d, c);
    };
}
