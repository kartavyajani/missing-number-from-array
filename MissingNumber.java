/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class Main
{
	public static void main(String[] args) {
		 int[] numbers = {6, 10, 19,20}; // Example number array

        Set<Integer> numberSet = new HashSet<>();
        List<Integer> missingNumbers = new ArrayList<>();

        // Add numbers to the set
        for (int num : numbers) {
            numberSet.add(num);
        }

        // Find missing numbers
        for (int i = 0; i < numbers.length - 1; i++) {
            int curr = numbers[i];
            int next = numbers[i + 1];
            System.out.println("next--->"+next+"--->curr"+curr);

            int diff = next - curr;

            if (diff > 1) {
                  int missingNumber = curr + 1;
        for (int j = 1; j < diff; j++) {
            missingNumbers.add(missingNumber);
            missingNumber++;
        }
            }
        }

        // Print the missing numbers
        System.out.println("Missing numbers:");
        for (int missingNumber : missingNumbers) {
            System.out.println(missingNumber);
        }
	}
}
