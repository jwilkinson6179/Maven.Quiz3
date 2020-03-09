package rocks.zipcode.io.quiz3.arrays;

import static rocks.zipcode.io.quiz3.fundamentals.StringUtils.capitalizeNthCharacter;

/**
 * @author leon on 09/12/2018.
 */

// TODO: Come back to deal with non-alphabetical characters

public class WaveGenerator {
    public static String[] wave(String str) {
        String[] waves = new String[str.length()];
        String waveString = str.toLowerCase();

        for (Integer i = 0; i < waves.length; i++) {
            waves[i] = capitalizeNthCharacter(waveString, i);
        }

        return waves;
    }
}