package main;

import java.util.*;

class Program {

    public static void main (String args[]){
        int[] array = {7,6,4,-1,1,2};
        fourNumberSum(array,16).forEach(x-> System.out.println(Arrays.toString(x)));
    }
    public static List<Integer[]> fourNumberSum(int[] array, int targetSum) {
        int constants = 0;
        List<Integer[]> resultant = new ArrayList();
        for(int i = 0 ; i < array.length; i++){
            for(int x = i+1 ; x< array.length; x++){
                for(int w = x+1 ; w< array.length; w++){
                    for(int y = w+1 ; y< array.length; y++){
                        constants = array[i]+array[x]+array[w]+array[y];
                        if(targetSum == constants)
                        {
                            Integer[] vectorCorrect = new Integer[4];
                            vectorCorrect[0]=array[i];
                            vectorCorrect[1]=array[x];
                            vectorCorrect[2]=array[w];
                            vectorCorrect[3]=array[y];
                            resultant.add(vectorCorrect);
                        }
                    }
                }
            }

        }
        return resultant;
    }
}