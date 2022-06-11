import java.util.ArrayList;

public class Kata
{
    int add(String numbers)
    {
        int result = 0;

        if (numbers.length() == 0)
            return 0;

        

        numbers = numbers
                .replace(",", "")
                .replace("\n", "")
                .replace("\r", "")
                .replace("/", "")
                .replace(";", "")
                .replace(String.valueOf("\\n"), "");

        char[] chars = numbers.toCharArray();

        for (int i = 0; i < chars.length; i++)
            result += Integer.parseInt(String.valueOf(chars[i]));


        return result;
    }
}
