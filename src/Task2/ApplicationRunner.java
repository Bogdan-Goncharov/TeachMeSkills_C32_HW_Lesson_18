package Task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ApplicationRunner {
    public static void main(String[] args) {

        List<String> students = getStrings();


        Scanner scanner = new Scanner(System.in);
                System.out.print("Enter a letter: ");
                String inputLetter = scanner.nextLine().trim();


                List<String> filteredNames = students.stream()
                        .filter(name -> name.toLowerCase().startsWith(inputLetter.toLowerCase()))
                        .sorted()
                        .toList();


                if (!filteredNames.isEmpty()) {
                    System.out.println("First name after sorting: " + filteredNames.getFirst());
                } else {
                    System.out.println("No names starting with the entered letter.");
                }
            }

    private static List<String> getStrings() {
        List<String> students = new ArrayList<>();
        students.add("Ilya");
        students.add("Marina");
        students.add("Sultan");
        students.add("Dmitry V");
        students.add("Dmitry H");
        students.add("Igor");
        students.add("Daniil");
        students.add("Oleg");
        students.add("Kirill R");
        students.add("Rita");
        students.add("Vlad");
        students.add("Sergey");
        students.add("Bogdan");
        students.add("Kirill M");
        return students;
    }
}



