public class Student {
    private String name;
    private Gender gender;

    public Student(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    public void findFemale() {
        if (this.gender == Gender.FEMALE) {
            System.out.println("She's name is " + this.name);
        }
    }
}
