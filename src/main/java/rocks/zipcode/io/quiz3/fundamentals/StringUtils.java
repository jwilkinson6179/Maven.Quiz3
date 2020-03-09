package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize)
    {
        StringBuilder result = new StringBuilder();
        String firstPart = str.substring(0,indexToCapitalize);
        String secondPart = str.substring(indexToCapitalize + 1, str.length());

        result.append(firstPart);
        result.append(str.substring(indexToCapitalize, indexToCapitalize + 1).toUpperCase());
        result.append(secondPart);

        return result.toString();
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString)
    {
        if(baseString.charAt(indexOfString) == characterToCheckFor)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static String[] getAllSubStrings(String string)
    {
        ArrayList<String> substrings = new ArrayList<>();

        for(Integer i = 0; i < string.length(); i++)
        {
            for(Integer k = i + 1; k <= string.length(); k++)
            {
                String currentSub = string.substring(i, k);
                if(!substrings.contains(currentSub))
                {
                    substrings.add(currentSub);
                }
            }
        }
        String[] array = substrings.toArray(new String[0]);

        return array;
    }

    public static Integer getNumberOfSubStrings(String input)
    {
        Integer n = input.length();
        return ((n * (n + 1) / 2) - 1);
    }
}
