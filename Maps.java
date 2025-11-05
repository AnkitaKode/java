
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student{
    int age;
    String name;
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
public class Maps {
    public static void main(String[] args) {
        Comparator<Student> com = new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                if (s1.age % 10 > s2.age % 10)
                    return 1;
                else if (s1.age % 10 < s2.age % 10)
                    return -1;
                else
                    return 0;
            }
        };

        List<Student> studs = new ArrayList<>();
        studs.add(new Student(21, "Aniket"));
        studs.add(new Student(20, "Anisha"));
        studs.add(new Student(22, "Aniti"));

        studs.sort(com);

        for (Student s : studs)
            System.out.println(s);

    }
    
}
// Remove Student class from this file.
// Place Student class in Student.java file.