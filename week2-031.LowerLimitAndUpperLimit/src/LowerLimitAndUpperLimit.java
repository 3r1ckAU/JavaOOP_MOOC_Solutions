
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        // write your code here

        int firstNumber = 0;
        int lastNumber = 0;
        
        System.out.println("First: ");
        firstNumber = Integer.parseInt(reader.nextLine());
        System.out.println("Last: ");
        lastNumber = Integer.parseInt(reader.nextLine());
        
        while(firstNumber<=lastNumber){
            System.out.println(firstNumber);
            firstNumber++;
        }
        
    }
}
