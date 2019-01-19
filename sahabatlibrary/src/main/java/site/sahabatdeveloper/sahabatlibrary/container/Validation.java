package site.sahabatdeveloper.sahabatlibrary.container;
import android.content.Context;
import android.widget.EditText;

import java.util.regex.Pattern;

enum PasswordRule{
    RULE_1, RULE_2, RULE_3
}

public class Validation {
    private Context context;

    public Validation(Context context) {
        this.context = context;
    }

    public boolean isValidEmail(String email){
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }

    public boolean isValidPassword(PasswordRule rule, String password){
        String regex;
        switch (rule){
            case RULE_1:
                regex = "\\d+";
                return password.matches(regex);
            case RULE_2:
                regex = "^[a-z0-9]+$";
                return password.matches(regex);
            case RULE_3:
                regex = "^[a-zA-Z0-9]+$";
                return password.matches(regex);
            default:
                return false;
        }
    }

    public boolean isLength(EditText editText, int min, int max) {
        if (min <= 0) {
            return (editText.getText().toString().length() <= max);
        } else if (max <= 0) {
            return (editText.getText().toString().length() >= min);
        } else {
            return (editText.getText().toString().length() >= min && editText.getText().toString().length() <= max);
        }
    }

    public boolean isNumber(EditText editText){
        return editText.getText().toString().matches("-?\\d+(\\.\\d+)?");
    }

    public boolean isDecimal(EditText editText){
        return editText.getText().toString().matches("\\d*\\.?\\d+");
    }

    public boolean isLetter(EditText editText){
        return editText.getText().toString().matches("[a-zA-Z]+");
    }

}
