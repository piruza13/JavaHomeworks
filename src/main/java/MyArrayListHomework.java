import java.util.ArrayList;
import java.util.List;


public class MyArrayListHomework {
    public static void main(String[] args) {
        List<Integer> mylist = new ArrayList<>();
        mylist.add(2);
        mylist.add(5);
        mylist.add(8);
        mylist.add(15);


        //Checking if the specific element present
        System.out.println("The list contains the inputet element: " + mylist.contains(5));

        // Finding maximum element.
        Integer max = mylist.stream().max(Integer::compare).get();
        System.out.println("The maximum element is: " + max);

        // Finding minimum element
        Integer min = mylist.stream().min(Integer::compare).get();
        System.out.println("The minimum element is:  " + min);

        // Sorting array list and counting the sum

        int temp = 0;
        int sum = 0;
        for (int i = 0; i < mylist.size(); i++) {


            for (int j = mylist.size() - 1; j > i; j--) {
                if (mylist.get(i) > mylist.get(j)) {


                    temp = mylist.get(i);
                    mylist.set(i, mylist.get(j));
                    mylist.set(j, temp);

                }
                sum += mylist.get(i);

            }

        }
        System.out.println( "The sorted vesion: ");
        for (int i: mylist) {
            System.out.println(i);

        }
        System.out.println("The sum is: " + sum);

        // Removing evens
        mylist.removeIf( num -> num%2==0);
        System.out.println(mylist);
    }

}
