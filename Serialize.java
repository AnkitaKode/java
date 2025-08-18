import java.io.*;

// Step 1: Implement Serializable
class Student implements Serializable {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class Serialize {
    public static void main(String[] args) {
        Student s = new Student(101, "Ankita");

        try {
            // Step 2: Create stream and write object
            FileOutputStream fos = new FileOutputStream("student.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(s);

            oos.close();
            fos.close();

            System.out.println("Object Serialized");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
