import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class day4 {


    public static void main(String[] args) throws FileNotFoundException {
        solvePartOne();

        solvePartTwo();
    }

    static void solvePartOne() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("inputs/day4.txt"));
        int countOverlap = 0;
        while(scanner.hasNext()) {
            String line = scanner.nextLine();
            String[] assignments = line.split(",");
            int[] firstElfSectors = convertStringToIntArray(assignments[0]);
            int[] secondElfSectors = convertStringToIntArray(assignments[1]);
            if(firstElfSectors[0] <= secondElfSectors[0] && firstElfSectors[1] >= secondElfSectors[1]) {
                countOverlap++;
            }
            else if(firstElfSectors[0] >= secondElfSectors[0] && firstElfSectors[1] <= secondElfSectors[1]) {
                countOverlap++;
            }
        }
        System.out.println(countOverlap);
    }

    static void solvePartTwo() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("inputs/day4.txt"));
        int countOverlap = 0;
        while(scanner.hasNext()) {
            String line = scanner.nextLine();
            String[] assignments = line.split(",");
            int[] firstElfSectors = convertStringToIntArray(assignments[0]);
            int[] secondElfSectors = convertStringToIntArray(assignments[1]);
            if(firstElfSectors[0] <= secondElfSectors[1] && secondElfSectors[0] <= firstElfSectors[1]) {
                countOverlap++;
            }
        }
        System.out.println(countOverlap);
    }

    static int[] convertStringToIntArray(String assignment) {
        String[] stringSectors = assignment.split("-");
        int[] convertedSectors = new int[2];
        for(int i=0; i<2; i++) {
            convertedSectors[i] = Integer.parseInt(stringSectors[i]);
        }
        return convertedSectors;
    }

}
