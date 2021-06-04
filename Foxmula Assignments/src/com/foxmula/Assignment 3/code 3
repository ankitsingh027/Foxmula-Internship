package com.foxmula.assignment3;

import java.util.*;
import java.util.Map.Entry;

public class SortFrequencyArray {
	
	 void frequencyNumber(int arr[], int size)
     {
        
         HashMap<Integer, Integer> freqMap = new HashMap<Integer, Integer>();

         for (int i=0;i<size;i++)
         {
             if (freqMap.containsKey(arr[i]))
             {
                 freqMap.put(arr[i], freqMap.get(arr[i]) + 1);
             }

             else
             {
                 freqMap.put(arr[i], 1);
             }
         }

         ArrayList<Integer> list = new ArrayList<Integer>();
         LinkedHashMap<Integer, Integer> sortedMap = new LinkedHashMap<Integer, Integer>();

         for (Map.Entry<Integer, Integer> entry : freqMap.entrySet())
         {
             list.add(entry.getValue());
         }

         Collections.sort(list, new Comparator<Integer>()
         {
             @Override
             public int compare(Integer o1, Integer o2)
             {
                 if(o1>o2)
                     return (1);
                 else if(o2>o1)
                     return(-1);
                 else
                     return (0);
             }
         });

         for (int i : list)
         {
             for (Entry<Integer, Integer> entry1 : freqMap.entrySet())
             {
                 if (entry1.getValue().equals(i))
                 {
                     sortedMap.put(entry1.getKey(),i);
                 }
             }
         }
         System.out.println("\n"+"Number = Frequency");
         System.out.println(sortedMap);
     }

}
