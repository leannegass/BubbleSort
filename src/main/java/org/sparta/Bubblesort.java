package org.sparta;

public class Bubblesort {
    static int[] bubbleSort(int[] ages) {

        int biggest = 0;
        for (int loops = 0; loops < ages.length - 1; loops++) {

            //ages = biggest(ages);

            int temp;

            for (int element = 0; element < ages.length - 1; element++) {
                //System.out.println("element val is " + ages[element]);
                //System.out.println(ages[element] + " " + ages[element + 1]);

                if (ages[element] > ages[element + 1]) {
                    temp = ages[element];
                    ages[element] = ages[element + 1];
                    ages[element + 1] = temp;
                    //System.out.println("Swap");

                }

                //System.out.println("Values are "+ Arrays.toString(ages));
            }


        }
        return ages;

    }
}



