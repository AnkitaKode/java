import java.io.*;

// Serializable Student class
class Student implements Serializable {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class DeSerialize {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("student.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Student s = (Student) ois.readObject();

            ois.close();
            fis.close();

            System.out.println("Deserialized Student: " + s.id + ", " + s.name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
