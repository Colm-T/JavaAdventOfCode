import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class day1 {
    public static void main(String[] args) throws FileNotFoundException {
        solvePart1();
        solvePart2();
    }

    static void solvePart1() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("inputs/day1.txt"));
        ArrayList<Integer> elfCalories = new ArrayList<Integer>();
        int tempSum = 0;
        while(scanner.hasNext()) {
            String line = scanner.nextLine();
            if(line.isEmpty()) {
                elfCalories.add(tempSum);
                tempSum = 0;
            }
            else {
                int temp = Integer.parseInt(line);
                tempSum += temp;
            }
        }
        System.out.println(Collections.max(elfCalories)); // 69795
    }

    static void solvePart2() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("inputs/day1.txt"));
        ArrayList<Integer> elfCalories = new ArrayList<Integer>();
        int tempSum = 0;
        while(scanner.hasNext()) {
            String line = scanner.nextLine();
            if(line.isEmpty()) {
                elfCalories.add(tempSum);
                tempSum = 0;
            }
            else {
                int temp = Integer.parseInt(line);
                tempSum += temp;
            }
        }
        Collections.sort(elfCalories);
        int resultSum = 0;
        for(int i = 1; i<4; i++) {
            resultSum += elfCalories.get(elfCalories.size() - i);
        }
        System.out.println(resultSum); // 208437
    }
}
