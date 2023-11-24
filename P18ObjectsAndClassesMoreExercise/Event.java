package P18ObjectsAndClassesMoreExercise;

public class Event {

    //Peter 120.00 Dev Development peter@abv.bg 28
    private String name;                // Peter
    private double salary;              // 120.00
    private String position;            // Dev
    private String department;          //Development
    private String mail;                // peter@abv.bg
    private int age;                 // 28

    public Event(String name, double salary, String position, String department, String mail, int age) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.mail = mail;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getPosition() {
        return position;
    }

    public String getDepartment() {
        return department;
    }

    public String getMail() {
        return mail;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %s %d",this.name,this.salary,this.mail,this.age);
    }
}
