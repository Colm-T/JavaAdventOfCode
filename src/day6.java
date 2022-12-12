import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class day6 {


    public static void main(String[] args) throws FileNotFoundException {
        solvePartOne();

        solvePartTwo();
    }

    static void solvePartOne() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("inputs/day6.txt"));

        String input = scanner.nextLine();
        int leftIndex = 0;
        int rightIndex = 4;
        while(rightIndex < input.length()) {
            if(checkUniqueLettersAmount(input.substring(leftIndex, rightIndex), 4)) {
                System.out.println("leftIndex = " + leftIndex + ", rightIndex = " + rightIndex);
                break;
            }
            leftIndex++;
            rightIndex++;
        }
    }

    static void solvePartTwo() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("inputs/day6.txt"));

        String input = scanner.nextLine();
        int leftIndex = 0;
        int rightIndex = 14;
        while(rightIndex < input.length()) {
            if(checkUniqueLettersAmount(input.substring(leftIndex, rightIndex), 14)) {
                System.out.println("leftIndex = " + leftIndex + ", rightIndex = " + rightIndex);
                break;
            }
            leftIndex++;
            rightIndex++;
        }
    }

    static boolean checkUniqueLettersAmount(String substring, int distinctCharacters) {
        Set<Character> uniqueLetters = new HashSet<Character>();
        for(char character : substring.toCharArray()) {
            uniqueLetters.add(character);
        }
        return uniqueLetters.size() == distinctCharacters;
    }

}
