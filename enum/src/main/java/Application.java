import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Linda", Gender.FEMALE));
        students.add(new Student("Bob", Gender.MALE));
        students.add(new Student("Solider", Gender.MALE));
        students.add(new Student("Cindy", Gender.FEMALE));

        for (Student student : students) {
            student.findFemale();
        }
    }

}
