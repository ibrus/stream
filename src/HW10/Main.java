package HW10;

import HW10.Task1.ListProcessor;
import HW10.Task2.Contact;
import HW10.Task2.Phonebook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import static HW10.Task2.Phonebook.subscribers;

public class Main {
    public static void main(String[] args) {
        ListProcessor listProcessor = new ListProcessor();
        Integer[] array = { 1, 2, 3, 4, 5 };
        List<String> list = new ArrayList<>();
        list.add("word1");
        list.add("word2");
        list.add("word3");
        list.add("word3");
        list.add("word4");
        list.add("word3");
        list.add("word5");

        Phonebook.add(new Contact("Mario", "11-11"));
        Phonebook.add(new Contact("Timon", "22-22"));
        Phonebook.add(new Contact("Pumba", "33-33"));
        Phonebook.add(new Contact("Hulk", "44-44"));
        Phonebook.add(new Contact("Mario", "55-55"));
        Phonebook.add(new Contact("Pumba", "66-66"));
        Phonebook.add(new Contact("Hulk", "77-77"));
        Phonebook.add(new Contact("Pumba", "88-88"));
        Phonebook.add(new Contact("Hulk", "99-99"));
        Phonebook.add(new Contact("Pumba", "88-88"));
//
//        System.out.println(ListProcessor.countOccurrence(list, "word3"));
//        System.out.println(listProcessor.toList(array));
//        System.out.println(listProcessor.findUnique(list));
//        listProcessor.calcOccurrence(list);
//        System.out.println(listProcessor.findOccurrence(list));

        long occurrenceCounter = list.stream()
                .filter(s -> s.equalsIgnoreCase("word3"))
                .count();

        Arrays.stream(array)
                .collect(Collectors.toList());

        list.stream()
                .distinct()
                .collect(Collectors.toList());

        list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .forEach(System.out::println);

        Contact hulk = subscribers.stream()
                .filter(s -> s.getName().equals("Hulk"))
                .findFirst()
                .get();

        System.out.println(hulk);

        List<Contact> allHulks = subscribers.stream()
                .filter(s -> s.getName().equals("Hulk"))
                .collect(Collectors.toList());

        System.out.println(allHulks);
    }
}
