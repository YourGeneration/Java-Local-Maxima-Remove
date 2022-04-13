package com.epam.rd.autotasks.arrays;

import java.util.Arrays;

public class LocalMaximaRemove {

    public static void main(String[] args) {
        int[] array = new int[]{18, 1, 3, 6, 7, -5};

        System.out.println(Arrays.toString(removeLocalMaxima(array)));
    }

    public static int[] removeLocalMaxima(int[] array){

        //put your code here
        int[] copyOfArray = new int[array.length];
        int counter = 0; //counter of copyOfArray index 

        for(int i = 0; i< array.length;i++){  
            
            //if the value is not a maxima add to the copy of array
            if(i==0){
                if(array[i] <= array[i+1]){
                    copyOfArray[counter] = array[i];
                    counter++;
                }
            }
            else if(i == (array.length-1)){
                if(array[i] <= array[i-1]){
                    copyOfArray[counter] = array[i];
                    counter++;
                }
            }
            else{
                if(array[i]<=array[i+1] || array[i]<=array[i-1]){
                    copyOfArray[counter] = array[i];
                    counter++;
                }
            }
        }

        int[] withoutMaxima = new int[counter];

        //adding elements to the final array
        for(int i =0; i<counter;i++){
            withoutMaxima[i] = copyOfArray[i];
        }

        return withoutMaxima;

        //throw new UnsupportedOperationException();
    }
}
