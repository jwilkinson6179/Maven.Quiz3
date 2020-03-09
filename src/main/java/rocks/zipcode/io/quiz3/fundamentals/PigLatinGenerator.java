package rocks.zipcode.io.quiz3.fundamentals;

import static rocks.zipcode.io.quiz3.fundamentals.VowelUtils.*;

/**
 * @author leon on 09/12/2018.
 */




public class PigLatinGenerator
{
    public String translate(String str)
    {
        String[] sentence = str.split(" ");
        StringBuilder pigLatinSentence = new StringBuilder();

        for(String word : sentence)
        {
            word = pigLatinWord(word);
            pigLatinSentence.append(word);
            pigLatinSentence.append(" ");
        }

        String result = pigLatinSentence.toString();
        result = result.substring(0, result.length() - 1);
        return result;
    }

    public String pigLatinWord(String str)
    {
        // If the word has no vowels, then return the original string plus "ay".
        if(!hasVowels(str))
        {
            return str + "ay";
        }
        // If the word starts with a vowel, then return the original string with "way" appended.
        else if(startsWithVowel(str))
        {
            return str + "way";
        }
        // If the word starts with a consonant, then shift consonants from the beginning of the word to the end of
        // the word until the first vowel. Then, return the newly shifted string with "ay" appended.
        else
        {
            Integer firstVowelIndex = getIndexOfFirstVowel(str);
            String beginning = str.substring(0, firstVowelIndex);
            String end = str.substring(firstVowelIndex, str.length());

            return end + beginning + "ay";
        }
    }
}
