import entities.Worker;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String path;
        double salary;
        double sum = 0.0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full file path: ");
        path = sc.next();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            List<Worker> workers = new ArrayList<>();

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                workers.add(new Worker(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }
            System.out.print("Enter salary: ");
            salary = sc.nextDouble();
            System.out.println("Email of people whose salary is more than 2000: ");
            //code
            List<String> names = workers.stream()
                    .filter(w -> w.getSalary() > salary)
                    .map(w -> w.getEmail())
                    .sorted()
                    .collect(Collectors.toList());

            names.forEach(System.out::println);
            sum = workers.stream()
                    .filter(p -> p.getName().startsWith("M"))
                    .map(p -> p.getSalary())
                    .reduce(0.0, (x,y) -> x + y);
            System.out.print("Sum of salary of people whose name starts with 'M': " + sum);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}