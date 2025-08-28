import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int i = input.next();
        int count = 0;

        for(int n = 0; n < i.length(); n++ ){
            int digit = Character.getNumericValue(i.charAt(n));
            if(digit == 5){
                count++;
            }
        }


    //    System.out.println(i);
    }
}
 