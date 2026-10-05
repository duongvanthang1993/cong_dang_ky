import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountValidator {
    // Regex tài khoản: chứa chữ cái thường (a-z), chữ số (0-9), dấu gạch dưới (_) và dài tối thiểu 6 ký tự
    private static final String ACCOUNT_REGEX = "^[_a-z0-9]{6,}$";

    public static boolean validate(String account) {
        if (account == null) {
            return false;
        }
        Pattern pattern = Pattern.compile(ACCOUNT_REGEX);
        Matcher matcher = pattern.matcher(account);
        return matcher.matches();
    }
}