public class MoodSensor {
    public static String GenerateMood() {
        int randomInt;
        String resultString;

        randomInt = (int)(Math.random() * 10);
        switch (randomInt) {
            case 0: resultString = "(◕‿◕)"; break;
            case 1: resultString = "(◡‿◡)"; break;
            case 2: resultString = "(＞﹏＜)"; break;
            case 3: resultString = "(︶︹︺)"; break;
            case 4: resultString = "(｡╯︵╰｡)"; break;
            case 5: resultString = "(×﹏×)"; break;
            case 6: resultString = "(•ิ_•ิ)?"; break;
            case 7: resultString = "(⊙_⊙)"; break;
            case 8: resultString = "((￣▽￣)/♫•*¨*•.¸¸♪)"; break;
            case 9: resultString = "(^_<))"; break;
            default: resultString = "(－.－)...zzz";
        }

        return resultString;
    }

    public static String GenerateResultMessage(String result) {
        return "Hmm... Today you're like " + result;
    }
}
