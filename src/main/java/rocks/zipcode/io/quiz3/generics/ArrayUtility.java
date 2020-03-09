package rocks.zipcode.io.quiz3.generics;

import java.lang.reflect.Array;
import java.util.function.Function;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public SomeType findOddOccurringValue()
    {
        for(Integer i = 0; i < array.length; i++)
        {
            Integer occurrencesOfElement = getNumberOfOccurrences(array[i]);

            if(occurrencesOfElement % 2 != 0)
            {
                return array[i];
            }
        }
        return null;
    }

    public SomeType findEvenOccurringValue()
    {
        for(Integer i = 0; i < array.length; i++)
        {
            Integer occurrencesOfElement = getNumberOfOccurrences(array[i]);

            if(occurrencesOfElement % 2 == 0)
            {
                return array[i];
            }
        }
        return null;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate)
    {
        Integer occurrences = 0;

        for(Integer i =0; i < array.length; i++)
        {
            if(array[i].equals(valueToEvaluate))
            {
                occurrences++;
            }
        }

        return occurrences;
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate)
    {
        SomeType[] output = (SomeType[]) Array.newInstance(array[0].getClass(), 10);

        return output;
    }
}
