import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//
//        1.Write a Java program to test if the first and the last element of an array of
//        integers are same. The length of the array must be greater than or equal to
//        2
//        Test Data:
//        array = 50, -20, 0, 30, 40, 60, 10
//        Sample Output:
//        false
        System.out.println("**********************************************");
        ArrayList <Integer> list_first_last =
                new ArrayList<>(Arrays.asList(0, -20, 0, 30, 40, 60, 10));
        if (list_first_last.size()>=2){
            if (list_first_last.get(0) == list_first_last.get(list_first_last.size()-1)){
                System.out.println("first element and last element are equal");
            }else{
                System.out.println("first element and last element are NOT equal");
            }
        }else {
            System.out.println("array size should be 2 or more ");
        }



//        2.Write a Java program to find the numbers greater than the average of the
//        numbers of a given array.
//                Original Array:
//        [1, 4, 17, 7, 25, 3, 100]
//        Expected Output:
//        The average of the said array is: 22.0 The numbers in the said array that are
//        greater than the average are: 25 100
        System.out.println("**********************************************");
        int[] numbers = {1, 4, 17, 7, 25, 3, 100};
        int sum =0 ;
        for (int i : numbers){
            sum = sum + i ;
        }
        int average = sum / numbers.length;
        System.out.println((average));

        ArrayList <Integer> list_Bigger_ave = new ArrayList<>();

        for (int j : numbers){
            if (j > average){
                list_Bigger_ave.add(j);
            }
        }

        System.out.println("The average of the said array is: "+average+" The numbers in the said array that are greater than the average are: "+list_Bigger_ave);

//        3.Write a Java program to get the larger value between first and last
//        element of an array of integers.
//        Original Array:
//         [20, 30, 40]
//        Sample Output:
//        Larger value between first and last element: 40
        System.out.println("**********************************************");
        ArrayList <Integer> list_larger_value =
                new ArrayList<>(Arrays.asList(20, 30, 40));
            if (list_larger_value.get(0) > list_larger_value.get(list_larger_value.size()-1)){
                System.out.println("Larger value between first and last element: "+list_larger_value.get(0));
            }else if (list_larger_value.get(0) < list_larger_value.get(list_larger_value.size()-1)){
                System.out.println("Larger value between first and last element: "+list_larger_value.get(list_larger_value.size()-1));

            }else{
                System.out.println("the two element are equal");

        }

//        4.Write a Java program to swap the first and last elements of an array and
//        create a new array.
//                Original Array:
//       [20, 30, 40]
//        Sample Output:
//        New array after swapping the first and last elements: [40, 30, 20]
        System.out.println("**********************************************");
        ArrayList <Integer> list_swap_value =
                new ArrayList<>(Arrays.asList(20, 30, 40));
        System.out.println("Before swapping : "+list_swap_value);
        ArrayList <Integer> list_swap_value_new =
                new ArrayList<>(list_swap_value);
        list_swap_value_new.set(0,list_swap_value.get(list_swap_value.size()-1));
        list_swap_value_new.set((list_swap_value.size()-1),list_swap_value.get(0));


        System.out.println("After swapping the first and last element : "+ list_swap_value_new);

//        5. Write a program that places the odd elements of an array before the
//        even elements.
//        Original Array:
//        [2,3,40,1,5,9,4,10,7]
//        Sample Output:
//        [3,1,5,9,7,2,40,4,10]
        System.out.println("**********************************************");
        ArrayList <Integer> odd_even =
                new ArrayList<>(Arrays.asList(2,3,40,1,5,9,4,10,7));
        ArrayList <Integer> odd=
                new ArrayList<>();
        ArrayList <Integer> even =
                new ArrayList<>();
        for(int i : odd_even){

            if (i %2==0){
                even.add(i);
            }else{
                odd.add(i);
            }
        }
        ArrayList <Integer> new_odd_even= new ArrayList<>();
        new_odd_even.addAll(odd);
        new_odd_even.addAll(even);
        System.out.println("Before placing the odd element before the even : "+odd_even);

        System.out.println("Before placing the odd element before the even : "+new_odd_even);

//        6. Write a program that test the equality of two arrays.
//        [2,3,6,6,4] [2,3,6,6,4]
//        Sample Output:
//        true
        System.out.println("**********************************************");

        ArrayList <Integer> test1=new ArrayList<>(Arrays.asList(2,3,6,6,4));
        ArrayList <Integer> test2=new ArrayList<>(Arrays.asList(2,3,6,6,4));

        if (test1.equals(test2) ){
            System.out.println("true");
        }else{
            System.out.println("false");
        }







    }
}