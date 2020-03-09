package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

    public static Boolean hasVowels(String word) {

        char[] phrase = word.toCharArray();

        for (Integer i = 0; i < phrase.length; i++) {
            for (Integer k = 0; k < vowels.length; k++) {
                if (phrase[i] == vowels[k]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        char[] phrase = word.toCharArray();

        for (Integer i = 0; i < phrase.length; i++) {
            for (Integer k = 0; k < vowels.length; k++) {
                if (phrase[i] == vowels[k]) {
                    return i;
                }
            }
        }

        return -1;
    }


    public static Boolean startsWithVowel(String word)
    {
        char firstLetter = word.charAt(0);

        return isVowel(firstLetter);
    }

    public static Boolean isVowel(Character character)
    {
        for (Integer i = 0; i < vowels.length; i++)
        {
            if (character.equals(vowels[i]))
            {
                return true;
            }
        }

        return false;
    }
}
