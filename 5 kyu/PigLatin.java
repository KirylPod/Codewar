import java.util.Arrays;
import java.util.regex.Pattern;

public class PigLatin {

    public static String pigIt(String str) {

        StringBuilder sb = new StringBuilder();

        Arrays.stream(str.split(" ")).forEach(s -> {
            if (!Pattern.matches("\\W", s)) {
                sb.append(s.substring(1) + s.substring(0, 1) + "ay ");
            } else {
                sb.append(s);
            }
        });

        return sb.toString().trim();
    }
}
