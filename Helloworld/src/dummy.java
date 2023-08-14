import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class dummy {
    public static void main(String[] args) {
        String str1 = "*1 Rental $70000Shopping  $299. Expenses $800 . House$200000";
        String pattern = "\\$\\d+(,\\d+)*(\\.\\d+)?";
        Pattern p = Pattern.compile(pattern);
        Matcher matcher = p.matcher(str1);

        int sum = 0;
        while (matcher.find()) {
            String price = matcher.group().replaceAll("\\$", "");
            int pi = Integer.parseInt(price);
            System.out.println("$" + pi);
            sum += pi;
        }
        System.out.println("$"+sum);
    }
}
