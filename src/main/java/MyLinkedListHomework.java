import java.util.*;


public class MyLinkedListHomework {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Piruza");
        list.add("Aida");
        list.add("Mery");
        list.add("Tigran");
        list.add("Mariam");
        list.add("Tigran");

        //Reverse the list.
        Collections.reverse(list);
        System.out.println("Reversed version: " + list);


        //Finding middle element.
        int middle = list.size() / 2;
        String middleValue = list.get(middle);
        System.out.println("The middle element is:  " + middleValue);


        //Merge lists and sort
        LinkedList<String> back = new LinkedList<>();
        back.add("Ani");
        back.add("Armen");
        back.add("Noro");
        Collections.sort(list);
        Collections.sort(back);


        list.addAll(back);
        Collections.sort(list);
        System.out.println("After merging and sorting: " + list);


        //Removing duplicates
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(list.get(i + 1)))
                list.remove(list.get(i));
        }
        System.out.println("After finding and removing duplicate elements: " + list);


        // Detecting if a LinkedList has a loop.
        Iterator i = list.iterator();
        System.out.println("The linked list has a loop: " + i.hasNext());


    }
}












