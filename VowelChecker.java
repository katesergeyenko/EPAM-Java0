import java.util.Collections;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Iterator;

public class VowelChecker {
    private static final int NUMBER_OF_VOWELS = 6;
    private static final char[] ARRAY_OF_VOWELS = {'a', 'e', 'i', 'o', 'u', 'y'};

    private static String ConvertStringToLowerCase(String string) {
        return string.toLowerCase();
    }

    private static char GetCharFromString(String string) {
        return string.charAt(0);
    }

    private static void CheckString(String string) throws NotCharException{
        if (string.length() != 1) {
            throw new NotCharException(string);
        }
    }

    private static void CheckLetter(char letter) throws NotLetterException {
        final int NUMBER_OF_LETTERS = 26;
        boolean result = false;

        for (int i = 0; i < NUMBER_OF_LETTERS; i++) {
            if (letter == '\u0061' + i) {
                result = true;
                break;
            }
        }

        if (!result) {
            throw new NotLetterException(letter);
        }
    }

    private static char GetLetter(String string) throws NotLetterException, NotCharException{
        CheckString(string);
        char resultChar = GetCharFromString(ConvertStringToLowerCase(string));
        CheckLetter(resultChar);

        return resultChar;
    }

    // with return
    public static boolean IsVowel(String string) throws NotLetterException, NotCharException {
        char letter = GetLetter(string);
        return letter == 'a' || letter == 'e' || letter == 'i'
                || letter == 'o' || letter == 'u' || letter == 'y';
    }

    // with for construction
    public static boolean IsVowelWithFor(String string) throws NotLetterException, NotCharException {
        char letter = GetLetter(string);
        boolean result = false;

        for (int i = 0; i < NUMBER_OF_VOWELS; i++) {
            if (letter == ARRAY_OF_VOWELS[i]) {
                result = true;
            }
        }

        return result;
    }

    // with while construction
    public static boolean IsVowelWithWhile(String string) throws NotLetterException, NotCharException {
        char letter = GetLetter(string);
        boolean result = false;

        int i = 0;
        while (i < NUMBER_OF_VOWELS) {
            if (letter == ARRAY_OF_VOWELS[i]) {
                result = true;
                break;
            }
            i++;
        }

        return result;
    }

    // with if-else construction
    public static boolean IsVowelWithIfElse(String string) throws NotLetterException, NotCharException {
        char letter = GetLetter(string);
        boolean result = false;

        if (letter == 'a' || letter == 'e' || letter == 'i'
                || letter == 'o' || letter == 'u' || letter == 'y') {
            result = true;
        }

        return result;
    }

    // switch construction
    public static boolean IsVowelWithSwitch(String string) throws NotLetterException, NotCharException {
        char letter = GetLetter(string);
        boolean result = false;

        switch (letter) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'y': result = true;
        }

        return result;
    }

    // with ternary operator
    public static boolean IsVowelWithTernary(String string) throws NotLetterException, NotCharException {
        char letter = GetLetter(string);
        boolean result = letter == 'a' ?
                true : letter == 'e' ?
                true : letter == 'i' ?
                true : letter == 'o' ?
                true : letter == 'u' ?
                true : letter == 'y' ?
                true : false;

        return result;
    }

    // with String.contains()
    public static boolean IsVowelWithStringContains(String string) throws NotLetterException, NotCharException {
        char letter = GetLetter(string);

        return ARRAY_OF_VOWELS.toString().contains(String.valueOf(letter));
    }

    // with String.indexOf()
    public static boolean IsVowelWithStringIndexOf(String string) throws NotLetterException, NotCharException {
        char letter = GetLetter(string);

        return ARRAY_OF_VOWELS.toString().indexOf(letter) != -1;
    }

    // with HashSet.contains()
    public static boolean IsVowelWithHashSetContains(String string) throws NotLetterException, NotCharException {
        char letter = GetLetter(string);
        HashSet<Character> vowelsHashSet = new HashSet<>();
        vowelsHashSet.add('a');
        vowelsHashSet.add('e');
        vowelsHashSet.add('i');
        vowelsHashSet.add('o');
        vowelsHashSet.add('u');
        vowelsHashSet.add('y');

        return vowelsHashSet.contains(letter);
    }

    // with HashSet Iterator
    public static boolean IsVowelWithHashSetIterator(String string) throws NotLetterException, NotCharException {
        char letter = GetLetter(string);
        HashSet<Character> vowelsHashSet = new HashSet<>();
        vowelsHashSet.add('a');
        vowelsHashSet.add('e');
        vowelsHashSet.add('i');
        vowelsHashSet.add('o');
        vowelsHashSet.add('u');
        vowelsHashSet.add('y');

        Iterator<Character> iterator = vowelsHashSet.iterator();
        while (iterator.hasNext()) {
            if (letter == iterator.next()) {
                return true;
            }
        }

        return false;
    }

    // with ArrayList.forEach()
    public static boolean IsVowelWithArrayListForEach(String string) throws NotLetterException, NotCharException {
        char letter = GetLetter(string);
        boolean result = false;
        ArrayList<Character> vowelsArrayList = new ArrayList<>();
        vowelsArrayList.add('a');
        vowelsArrayList.add('e');
        vowelsArrayList.add('i');
        vowelsArrayList.add('o');
        vowelsArrayList.add('u');
        vowelsArrayList.add('y');

        for (int i: vowelsArrayList) {
            if (letter == i) {
                result = true;
            }
        }

        return result;
    }

    // with ArrayList for
    public static boolean IsVowelWithArrayListFor(String string) throws NotLetterException, NotCharException {
        char letter = GetLetter(string);
        boolean result = false;
        ArrayList<Character> vowelsArrayList = new ArrayList<>();
        vowelsArrayList.add('a');
        vowelsArrayList.add('e');
        vowelsArrayList.add('i');
        vowelsArrayList.add('o');
        vowelsArrayList.add('u');
        vowelsArrayList.add('y');

        for (int i = 0; i < vowelsArrayList.size(); i++) {
            if (letter == vowelsArrayList.get(i)) {
                result = true;
            }
        }

        return result;
    }

    // with Collections.frequency()
    public static boolean IsVowelWithCollectionsFrequency(String string) throws NotLetterException, NotCharException {
        char letter = GetLetter(string);
        boolean result = false;
        ArrayList<Character> vowelsArrayList = new ArrayList<>();
        vowelsArrayList.add('a');
        vowelsArrayList.add('e');
        vowelsArrayList.add('i');
        vowelsArrayList.add('o');
        vowelsArrayList.add('u');
        vowelsArrayList.add('y');

       if (Collections.frequency(vowelsArrayList, letter) != 0) {
           result = true;
       }

        return result;
    }

    //with regex
    public static boolean IsVowelWithRegEx(String string) throws NotLetterException, NotCharException {
        String letter = String.valueOf(GetLetter(string));
        return letter.matches("[aeiouy]");
    }

    public static boolean IsVowelWithEnum(String string) throws NotLetterException, NotCharException {
        String letter = String.valueOf(GetLetter(string));

        return letter.matches("[aeiouy]");
    }

    public static String GenerateResultMessage(boolean result) {
        String resultString;

        if (result) {
            resultString = "Letter is vowel.";
        } else {
            resultString = "Letter is consonant.";
        }

        return resultString;
    }
}
