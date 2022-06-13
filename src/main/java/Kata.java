import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Kata
{
    int add(String numbers) throws NegativesNotAllowedException
    {
        ArrayList<String> negatives = new ArrayList<>();
        int result = 0;

        if (numbers.length() == 0)
            return 0;

       /* numbers = numbers.replaceAll("[^1234567890-]", "x");

        String[] splited = numbers.split("x");

        for (String s : splited)
        {
            int number = Integer.parseInt(s);

            if (number < 0)
                negatives.add(s);

            if (number < 1000)
                result += number;
        }*/

        numbers += "%";
        char[] chars = numbers.toCharArray();
        String numberStr = "";
        for (char c : chars)
        {
            if (Character.isDigit(c) || c == '-')
                numberStr += c;
            else if (numberStr != "") {
                int number = Integer.parseInt(numberStr);

                if (number < 0)
                    negatives.add(numberStr);

                if (number < 1000)
                    result += number;

                numberStr = "";
            }
        }

        if (negatives.isEmpty())
            return result;

        else throw new NegativesNotAllowedException("Negatives Not Allowed!  " + negatives);

    }
}
