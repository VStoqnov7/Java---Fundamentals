package P20MapsLambdaAndStreamAPIExercise;


import java.util.*;

public class P05Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        //име на курс -> списък с имената на студенти
        Map<String, List<String>> courses = new LinkedHashMap<>();
        while(!input.equals("end")) {
            //"{име на курс} : {име на човек}" -> split (" : ") -> ["{courseName}", "{personName}"]
            String courseName = input.split(" : ")[0];
            String personName = input.split(" : ")[1];
            //прверка имам ли такъв курс
            //ако нямам такъв курс
            if(!courses.containsKey(courseName)) {
                courses.put(courseName, new ArrayList<>());
            }

            //ако курсът е нов -> връща празен списък
            //ако курсът е стар -> връща моментния списък с хора
            courses.get(courseName).add(personName);

            input = scanner.nextLine();
        }
        //courseName -> List<String>
        courses.entrySet()
                .forEach(entry -> {
                    //key: име на курса
                    //value: списък с хората
                    //име на курса -> бр. хората
                    System.out.println(entry.getKey() + ": " + entry.getValue().size());
                    entry.getValue().forEach(studentName -> System.out.println("-- " + studentName));
                    //ascending order / нарастващ ред
                });
    }
}

//        String command = scanner.nextLine();
//
//        Map<String, ArrayList<String>> products = new LinkedHashMap<>();
//
//        while (!command.equals("end")) {
//            String[] name = command.split(" : ");
//
//            String course = name[0];
//            String student = name[1];
//
//            products.putIfAbsent(course,new ArrayList<>());
//            products.get(course).add(student);
//
//
//            command = scanner.nextLine();
//        }
//
//
//        for (Map.Entry<String, ArrayList<String>> entry : products.entrySet()) {
//            int count = entry.getValue().size();
//            System.out.printf("%s: %d%n",entry.getKey(),count);
//
//            for (int i = 0; i < entry.getValue().size(); i++) {
//                System.out.printf("-- %s%n",entry.getValue().get(i));
//
//
//            }
//
//
//        }
//
//
//    }
//}
