import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSum {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);

        int sum = findSum(numbers);
        System.out.println("The sum of elements is: " + sum);
        System.out.println("ArrayList numbers are: " + numbers);
        removeEven(numbers);
        System.out.println("ArrayList after removing even numbers: " + numbers);
        findMaxMin(numbers);
        int elementToCheck = 15;
        boolean isPresent = checkElement(numbers, elementToCheck);
        if(isPresent) {
            System.out.println(elementToCheck + " is present in ArrayList");
        } else{
            System.out.println((elementToCheck + " is not present in the ArrayList"));
        }
        sortAscending(numbers);
        System.out.println("Sorted list in ascending order: " + numbers);
    }
    public static int findSum(ArrayList<Integer> arr){
        int sum = 0;
        for(int num : arr){
            sum += num;
        }
        return sum;
    }
    public  static void  removeEven(ArrayList<Integer> arr){
        for (int i = arr.size()-1; i >=0; i-- ){
            if (arr.get(i) %2 == 0){
                arr.remove(i);
            }
        }
    }
    public static void findMaxMin(ArrayList<Integer> arr){
        if(arr.isEmpty()){
            System.out.println("Array List is empty");
            return;
        }
        int max = Collections.max(arr);
        int min = Collections.min(arr);

        System.out.println("Maximum element is: " + Collections.max(arr));
        System.out.println("Minimum element is: " + Collections.min(arr));
    }
    public static boolean  checkElement(ArrayList<Integer> arr, int element){
        return arr.contains(element);
    }
    public static void sortAscending(ArrayList<Integer> arr){
        int n = arr.size();

        for (int i = 0; i < n - 1; i++){
            for (int j = 0; j < n - i - 1; j++){
                if (arr.get(j) > arr.get(j+1)){
                    int temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j +1, temp);
                }
            }
        }
    }
}