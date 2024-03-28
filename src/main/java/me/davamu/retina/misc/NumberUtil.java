package me.davamu.retina.misc;

import lombok.experimental.UtilityClass;

import java.util.concurrent.ThreadLocalRandom;

@UtilityClass
public class NumberUtil {

    /**
     * This method receives a float number (percentage) between 0.00 and 1.00, generates a random number and checks if
     * it is in the received percentage.
     *
     * @param n     float number
     * @return      true if the random number is in the percentage passed as parameter
     */
    public boolean isProbability(float n){
        return ThreadLocalRandom.current().nextFloat() < n;
    }

}
