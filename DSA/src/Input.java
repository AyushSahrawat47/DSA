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

        for (int i =0; i< arr.length; i++){
            System.out.println(arr[i] + " ");
        }

    }
}
