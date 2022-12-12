import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class day2 {
    public static void main(String[] args) throws FileNotFoundException {
        solvePart1();

        solvePart2();
    }

    static void solvePart1() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("inputs/day2.txt"));
        int pointSum = 0;
        while(scanner.hasNext()) {
            String line = scanner.nextLine();
            String[] gestures = line.split(" ");
            pointSum += calculatePointsPartOne(gestures[0], gestures[1]);
        }

        System.out.println(pointSum); // 15422
    }

    static void solvePart2() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("inputs/day2.txt"));
        int pointSum = 0;
        while(scanner.hasNext()) {
            String line = scanner.nextLine();
            String[] gestures = line.split(" ");
            pointSum += calculatePointsPartTwo(gestures[0], gestures[1]);
        }

        System.out.println(pointSum); // 15422
    }

    static int calculatePointsPartOne(String opponent, String player) {
        switch(opponent) { //   rock=1, paper=2, scissors=3,    loss=0, draw=3, win=6
            case "A":
                switch(player) {
                    case "X":
                        return 4;
                    case "Y":
                        return 8;
                    case "Z":
                        return 3;
                }
            case "B":
                switch(player) {
                    case "X":
                        return 1;
                    case "Y":
                        return 5;
                    case "Z":
                        return 9;
                }
            case "C":
                switch(player) {
                    case "X":
                        return 7;
                    case "Y":
                        return 2;
                    case "Z":
                        return 6;
                }
        }
        return 0;
    }

    static int calculatePointsPartTwo(String opponent, String player) {
        switch(opponent) { //   rock=1, paper=2, scissors=3,    loss=0, draw=3, win=6
            case "A":
                switch(player) {
                    case "X":
                        return 3;
                    case "Y":
                        return 4;
                    case "Z":
                        return 8;
                }
            case "B":
                switch(player) {
                    case "X":
                        return 1;
                    case "Y":
                        return 5;
                    case "Z":
                        return 9;
                }
            case "C":
                switch(player) {
                    case "X":
                        return 2;
                    case "Y":
                        return 6;
                    case "Z":
                        return 7;
                }
        }
        return 0;
    }
}
