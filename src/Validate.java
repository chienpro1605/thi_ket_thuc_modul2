import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    static final String PHONENUMBER_REGEX = "^[0][2359][0-9]{8}$";
    static final String EMAIL_REGEX = "^[a-zA-Z0-9]*[@][g][m][a][i][l][.][a-z]*$";

    public static String getPhonenumberRegex() {
        return PHONENUMBER_REGEX;
    }

    public static String getEmailRegex() {
        return EMAIL_REGEX;
    }

    public static boolean valid(String str, String regex){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }


}
