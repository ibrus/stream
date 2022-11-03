package HW10.Task1;

import HW10.Animals.Animal;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListProcessor<E> {


    public static <E> int countOccurrence(List<E> list, E elementToCompare){
        int stringOccurrence = 0;
        for (E e : list) {
            if(e.toString().equalsIgnoreCase(elementToCompare.toString())) stringOccurrence++;
        }
        return stringOccurrence;
//        return Collections.frequency(list, stringToCompare));
    }

    public List<E> toList(E[] arr){
        List<E> outputList = new ArrayList<>();
        Collections.addAll(outputList, arr);
        return outputList;
//        return Arrays.asList(arr);
    }

    public List<E> findUnique(List<E> list){
        List<E> uniqueList = new ArrayList<>();
        for (E e : list) {
            if(!uniqueList.contains(e)) uniqueList.add(e);
        }
        return uniqueList;
    }

    public void calcOccurrence(List<E> list){
        List<E> uniqueList = findUnique(list);
        for (E e: uniqueList) {
            System.out.println("string " + e.toString() + " occurred " + countOccurrence(list, e));
        }
    }

    public List<Pair<E,Integer>> findOccurrence(List<E> list){
        List<E> uniqueList = findUnique(list);
        List<Pair<E,Integer>> occurrenceList = new ArrayList<>();
        for (E e : uniqueList) {
            occurrenceList.add(new Pair<>(e,countOccurrence(list, e)));
        }
        return occurrenceList;
    }

}
