package rocks.zipcode.io.quiz3.arrays;

import static rocks.zipcode.io.quiz3.fundamentals.StringUtils.capitalizeNthCharacter;

/**
 * @author leon on 09/12/2018.
 */

// TODO: Come back to deal with non-alphabetical characters

public class WaveGenerator {
    public static String[] wave(String str)
    {
        String waveString = str.toLowerCase();
        Integer count = 0;

        for(Integer i = 0; i < str.length(); i++)
        {
            if(Character.isLetter(waveString.charAt(i)))
            {
                count++;
            }
        }

        String[] waves = new String[count];
        Integer idx = 0;
        for (Integer i = 0; i < str.length(); i++)
        {
            if(Character.isLetter(waveString.charAt(i)))
            {
                waves[idx] = capitalizeNthCharacter(waveString, i);
                idx++;
            }
        }

        return waves;
    }
}