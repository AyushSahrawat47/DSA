//How to take input in arrays

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        int[] arr = new int[5];

//    input using for loop
        for (int i = 0; i < arr.length; i++){
            arr[i] = input.nextInt();
        }

//        for loop to display every element of the array
//        for (int i =0; i< arr.length; i++){
//            System.out.println(arr[i] + " ");
//        }

//        for each loop to display elements of the array
        for(int num : arr){  // for every element in array, print the element
          System.out.println(num + ""); // here num represents the element of the array
        }

    }
}
