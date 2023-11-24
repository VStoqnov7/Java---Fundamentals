package P20MapsLambdaAndStreamAPIExercise;

import java.util.*;

public class P06StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int countStudents = Integer.parseInt(scanner.nextLine());
        //студент -> списък с оценки
        Map<String, List<Double>> studentGrades = new LinkedHashMap<>();
        for (int i = 0; i < countStudents; i++) {
            String studentName = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());
            //студентът да го нямаме в списъка
            if (!studentGrades.containsKey(studentName)) {
                studentGrades.put(studentName, new ArrayList<>());
            }
            studentGrades.get(studentName).add(grade);
        }

        //студент -> ср. оценка
        Map<String, Double> studentAverageGrade = new LinkedHashMap<>(); //студентите ср. оценка >= 4.50
        //търсим среданата оценка на всички студенти
        for (Map.Entry<String, List<Double>> entry : studentGrades.entrySet()) {
            //entry -> име (String) + списък с оценки (list<double>)
            String studentName = entry.getKey();
            List<Double> grades = entry.getValue();
            double averageGrade = getAverageGrade (grades);
            if(averageGrade >= 4.50) {
                studentAverageGrade.put(studentName, averageGrade);
            }
        }
        //разменяме записите ако на втория оценката > оценката на първия
        studentAverageGrade.entrySet()
                .forEach(entry -> System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue()));

    }

    private static double getAverageGrade(List<Double> grades) {
        double sumGrades = 0;
        for (double grade : grades) {
            sumGrades += grade;
        }
        return sumGrades / grades.size();
    }
}

//        int n = Integer.parseInt(scanner.nextLine());
//
//        Map<String, ArrayList<Double>> studentsMap = new LinkedHashMap<>();
//        for (int i = 0; i < n; i++) {
//            String name = scanner.nextLine();
//            double grade = Double.parseDouble(scanner.nextLine());
//
//            studentsMap.putIfAbsent(name,new ArrayList<>());
//            studentsMap.get(name).add(grade);
//
//
//
//        }
//
//
//        for (Map.Entry<String, ArrayList<Double>> entry : studentsMap.entrySet()) {
//            double averageGrade = entry.getValue().stream().mapToDouble(Double::doubleValue).average().getAsDouble();
//
//            if (averageGrade >= 4.50){
//            System.out.printf("%s -> %.2f%n",entry.getKey(),averageGrade);
//
//            }
//
//
//
//
//        }
//
//
//    }
//}
