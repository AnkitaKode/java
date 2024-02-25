class student {
    String name;
    int rollno;
    int marks;
}

public class Enhanced_loop {

    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "Bella";
        s1.rollno = 3;
        s1.marks = 80;

        student s2 = new student();
        s2.name = "Harry";
        s2.rollno = 4;
        s2.marks = 89;

        student students[] = new student[2];
        students[0] = s1;
        students[1] = s2;

        for (student stud : students) {
            System.out.println(stud.name + ":" + stud.rollno + ":" + stud.marks);
        }
    }

}
