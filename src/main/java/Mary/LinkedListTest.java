import java.util.HashSet;
import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args){
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(1);
        linkedList.add(3);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(4);
        linkedList.add(5);

        LinkedList<Integer> linkedList1 = new LinkedList<>();
        linkedList1.add(6);
        linkedList1.add(7);
        linkedList1.add(8);
        linkedList1.add(9);
        linkedList1.add(10);

        System.out.println("Original list: " + linkedList);

        reversedLinkList(linkedList);
        System.out.println("Reversed list: " + linkedList);

        int middle = findMiddleElement(linkedList);
        System.out.println("Middle element: " + middle);

        linkedList.add(linkedList.getFirst());
        System.out.println("Linked list has a loop: " + hasLoop(linkedList));

        LinkedList<Integer> mergedList = mergeSortedLists(linkedList, linkedList1);
        System.out.println("Merged List: " + mergedList);

        removeDuplicates(linkedList);
        System.out.println("List after removing duplicates: " + linkedList);
    }
    public static void reversedLinkList(LinkedList<Integer> list){
        if(list == null || list.isEmpty() || list.size() == 1){
            return;
        }
        int size = list.size();
        for (int i = 0; i < size / 2; i++ ){
            int temp = list.get(i);
            list.set(i, list.get(size - 1 - i));
            list.set(size - 1 - i, temp);
        }
    }
    public static int findMiddleElement(LinkedList<Integer> list){
        if(list == null || list.isEmpty()){
            throw new IllegalArgumentException("List is empty or null");
        }
        int size = list.size();
        int middleIndex = size/2;

        if(size % 2 == 0){
            return list.get(middleIndex - 1);
        } else{
            return list.get(middleIndex);
        }
    }
    public static boolean hasLoop(LinkedList<Integer> list){
        if(list == null || list.isEmpty()){
            return false;
        }
        int size = list.size();
        for (int i = 0; i < size; i++){
            int current = list.get(i);
            for(int j = i+1; j < size; j++){
                if(current == list.get(j)){
                    return true;
                }
            }
        }
        return false;
    }
    public static LinkedList<Integer> mergeSortedLists(LinkedList<Integer> linkedList, LinkedList<Integer> linkedList1){
        LinkedList<Integer> mergedList = new LinkedList<>();
        mergedList.addAll(linkedList);
        mergedList.addAll(linkedList1);
        mergedList.sort(Integer::compareTo);
        return  mergedList;
    }

    public static void removeDuplicates(LinkedList<Integer> list){
        if(list == null || list.isEmpty()){
            return;
        }
        HashSet<Integer> set = new HashSet<>();
        LinkedList<Integer> result = new LinkedList<>();

        for (Integer element: list){
            if (!set.contains(element)){
                set.add(element);
                result.add(element);
            }
        }
        list.clear();
        list.addAll(result);
    }
}