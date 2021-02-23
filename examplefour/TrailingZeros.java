package examplefour;

public class TrailingZeros {

    public static String removeLeadingZeros(String str) {

        String regex = "^0+(?!$)";
        str = str.replaceAll(regex, "");
        if (str == null) {
            return null;
        }
        char[] chars = str.toCharArray();
        int length, i;
        length = str.length();
        
        for (i = length - 1; i >= 0; i--) {
            if (chars[i] != '0') {
                break;
            }
        }
        return (i == length - 1) ? str : str.substring(0, i + 1);

    }

    public static void main(String[] args) {
        String str = "0000037923760000";

        System.out.println(removeLeadingZeros(str));
    }

}

