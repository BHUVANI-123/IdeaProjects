import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PriceExtractor {
    public static void main(String[] args) {
        String str1 = "1 Rental $70,000Shopping $299. Expenses $800. House$2,00,000";
        Pattern pattern = Pattern.compile("\\$\\d+(,\\d{3})*(\\.\\d+)?");
        Matcher matcher = pattern.matcher(str1);

        int sum = 0;
        while (matcher.find()) {
            String priceString = matcher.group().replaceAll("\\$|,", "");
            int price = Integer.parseInt(priceString);
            sum += price;
        }

        System.out.println("Sum of prices: $" + sum);
    }
}

