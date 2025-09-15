import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AmazonBackend{
    
    public static boolean checkCode(String code){
        Pattern pattern = Pattern.compile("^[1-9]\\d?\\d?\\.([A-Z][A-Za-z]* )+ *(\\d\\d\\d\\d\\d)?$");
        Matcher matcher = pattern.matcher(code);
        return matcher.find();
    }

}
