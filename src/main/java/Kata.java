import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Kata
{
    int add(String numbers)
    {
        ArrayList<String> strings = new ArrayList<>();
        int result = 0;

        if (numbers.length() == 0)
            return 0;

        numbers = numbers.replaceAll("[^1234567890]", "x");

        String[] splited = numbers.split("x");

        strings.addAll(Arrays.asList(splited));

        strings.removeAll(Arrays.asList("", "x"));

        for (int i = 0; i < strings.size(); i++)
        {
            if (Integer.parseInt(strings.get(i)) > 1000)
                strings.remove(i);

            result += Integer.parseInt(String.valueOf(strings.get(i)));
        }

        return result;
    }
}
