package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {
        char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
        char[] phrase = word.toCharArray();

        for(Integer i = 0; i < phrase.length; i++)
        {
            for(Integer k = 0; k < vowels.length; k++)
            {
                if(phrase[i] == vowels[k])
                {
                    return true;
                }
            }
        }
        return false;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        return null;
    }


    public static Boolean startsWithVowel(String word) {
        return null;
    }

    public static Boolean isVowel(Character character) {
        return null;
    }
}
