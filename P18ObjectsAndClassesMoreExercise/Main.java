package P18ObjectsAndClassesMoreExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        List<Event> eventList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            List<String> command = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());


            String name = command.get(0);
            double salary = Double.parseDouble(command.get(1));
            String position = command.get(2);
            String department = command.get(3);
            String mail = command.get(4);
            int age = Integer.parseInt(command.get(5));

            Event event = new Event(name,salary,position,department,mail,age);
            eventList.add(event);


        }

        double sum = 0;
        String departmentName = "";

        for (Event event : eventList) {
            if (event.getSalary() > sum){
                sum = event.getSalary();
                departmentName = event.getName();
            }
        }

        System.out.printf("Highest Average Salary: %s%n",departmentName);


        for (Event event : eventList) {
            if (event.getName().equals(departmentName)){
                System.out.println(event.toString());


            }

        }



    }
}
