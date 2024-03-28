class human {
    private int age;
    private String name;

    public int getage() {
        return age;
    }

    public void setage(int age, human obj) {

        this.age = age;
        // human obj1 = new human();
        // obj1.age = age;
    }

    public String getname() {
        return name;
    }

    public void setname(String n) {
        name = n;
    }

}

public class thisword {
    public static void main(String[] args) {
        human obj = new human();
        obj.setage(19, obj);
        obj.setname("Ankita");

        // obj.age = 11;
        // obj.name = "Ankita";

        System.out.println(obj.getname() + ":" + obj.getage());
    }
}