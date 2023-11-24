package P14ListsExercise;

import java.util.*;


public class P10SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] input = scanner.nextLine().split(",\\s+");
        List<String> course = new ArrayList<>(Arrays.asList(input));

        String command = scanner.nextLine();
        while (!command.equals("course start")) {
            String[] tokens = command.split(":");
            switch (tokens[0]) {
                case "Add":
                    String lesson = tokens[1];
                    if (!course.contains(lesson)) {
                        course.add(lesson);
                    }
                    break;
                case "Insert":
                    lesson = tokens[1];
                    int index = Integer.parseInt(tokens[2]);
                    if (!course.contains(lesson) && index >= 0 && index < course.size()) {
                        course.add(index, lesson);
                    }
                    break;
                case "Remove":
                    lesson = tokens[1];
                    if (course.contains(lesson)) {
                        course.remove(lesson);
                    }
                    if (course.contains(lesson + "-P13Exercise")) {
                        course.remove(lesson + "-P13Exercise");
                    }
                    break;
                case "Swap":
                    String firstLesson = tokens[1];
                    String secondLesson = tokens[2];
                    if (course.contains(firstLesson) && course.contains(secondLesson)) {
                        int firstLessonIndex = course.indexOf(firstLesson);
                        int secondLessonIndex = course.indexOf(secondLesson);
                        course.set(firstLessonIndex, secondLesson);
                        course.set(secondLessonIndex, firstLesson);
                        if (course.contains(firstLesson + "-P13Exercise")) {
                            int firstExerciseIndex = course.indexOf(firstLesson + "-P13Exercise");
                            course.remove(firstLesson + "-P13Exercise");
                            course.add(secondLessonIndex + 1, firstLesson + "-P13Exercise");
                        }
                        if (course.contains(secondLesson + "-P13Exercise")) {
                            int secondExerciseIndex = course.indexOf(secondLesson + "-P13Exercise");
                            course.remove(secondLesson + "-P13Exercise");
                            course.add(firstLessonIndex + 1, secondLesson + "-P13Exercise");
                        }
                    }
                    break;
                case "P13Exercise":
                    lesson = tokens[1];
                    if (course.contains(lesson) && !course.contains(lesson + "-P13Exercise")) {
                        int lessonIndex = course.indexOf(lesson);
                        course.add(lessonIndex + 1, lesson + "-P13Exercise");
                    } else if (!course.contains(lesson)) {
                        course.add(lesson);
                        course.add(lesson + "-P13Exercise");
                    }
                    break;
                default:
                    break;
            }
            command = scanner.nextLine();
        }


        int numbers = 1;

        for (String item : course) {
            System.out.println(numbers + "." + item);
            numbers++;

        }


    }
}