import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class day3 {


    public static void main(String[] args) throws FileNotFoundException {
        solvePartOne();

        solvePartTwo();
    }

    static void solvePartOne() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("inputs/day3.txt"));
        int totalSum = 0;
        while(scanner.hasNext()) {
            String line = scanner.nextLine();
            String firstCompartment = line.substring(0, line.length()/2);
            String secondCompartment = line.substring(line.length()/2);
            Set<Character> firstSet = convertStringToSet(firstCompartment);
            Set<Character> secondSet = convertStringToSet(secondCompartment);
            firstSet.retainAll(secondSet);
            Character[] duplicate = firstSet.toArray(new Character[firstSet.size()]);
            totalSum += convertItemToValue(duplicate[0]);
        }
        System.out.println(totalSum);
    }

    static void solvePartTwo() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("inputs/day3.txt"));
        int totalSum = 0;
        int squadCounter = 0;
        Set<Character> firstSet = new HashSet<>();
        Set<Character> secondSet;
        Set<Character> thirdSet;
        while(scanner.hasNext()) {
            squadCounter += 1;
            String line = scanner.nextLine();
            switch(squadCounter) {
                case 1:
                    firstSet = convertStringToSet(line);
                    break;
                case 2:
                    secondSet = convertStringToSet(line);
                    firstSet.retainAll(secondSet);
                    break;
                case 3:
                    thirdSet = convertStringToSet(line);
                    firstSet.retainAll(thirdSet);
                    Character[] duplicate = firstSet.toArray(new Character[firstSet.size()]);
                    totalSum += convertItemToValue(duplicate[0]);
                    squadCounter = 0;
                    break;
            }
        }
        System.out.println(totalSum);
    }

    static int convertItemToValue(char item) {
        if(Character.isLowerCase(item)) {
            return ((int) item - 96);
        }
        else if(Character.isUpperCase(item)) {
            return ((int) item - 38);
        }
        return 0;
    }

    static Set<Character> convertStringToSet(String str) {
        Set<Character> uniqueCharacters = new HashSet<>();
        char[] chars = str.toCharArray();
        for(char character : chars) {
            uniqueCharacters.add(character);
        }
        return uniqueCharacters;
    }

}
