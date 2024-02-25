class student {
    String name;
    int rollno;
    int marks;
}

public class arrayofObject {
    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "Bella";
        s1.rollno = 3;
        s1.marks = 80;

        student s2 = new student();
        s2.name = "Harry";
        s2.rollno = 4;
        s2.marks = 89;

        student s3 = new student();
        s3.name = "Ron";
        s3.rollno = 7;
        s3.marks = 88;

        student students[] = new student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (int i = 0; i <= 2; i++) {
            System.out.println(students[i].name + " " + students[i].rollno + " " + students[i].marks);
        }
    }

}
