package org.sparta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;

import java.util.Arrays;

/**
 * Unit test for simple App.
 */
public class BubblesortTest {

        @Test
        @DisplayName("Given the int list is {3,7,1,11,25,2} return {1,2,3,7,11,25}")
        void givenTheIntlistIs() {
            int [] ages = {3,7,1,11,25,2};
            int [] expected = {1,2,3,7,11,25};
            Assertions.assertEquals(Arrays.toString(expected), Arrays.toString(Bubblesort.bubbleSort(ages)));
        }

    @Test
    @DisplayName("Given the int list has negatives {3,7,1,11,25,-2} return {1,2,3,7,11,25}")
    void givenTheIntlistHasNegatives() {
        int [] ages = {3,7,1,11,25,-2};
        int [] expected = {-2,1,3,7,11,25};
        Assertions.assertEquals(Arrays.toString(expected), Arrays.toString(Bubblesort.bubbleSort(ages)));
    }

    @Test
    @DisplayName("Given the int list is empty {3,7,1,11,25,2} return {1,2,3,7,11,25}")
    void givenTheIntlistIsEmpty() {
        int [] ages = {};
        int [] expected = {};
        Assertions.assertEquals(Arrays.toString(expected), Arrays.toString(Bubblesort.bubbleSort(ages)));
    }

}
