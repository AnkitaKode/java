class Computer {

    public void Music() {

        System.out.println("Music is Playing...");
    }

    public String GetMeAPen(int cost) {
        if (cost <= 10)
            return "Pen";
        else
            return "Nothing";
    }
}

public class methods {
    public static void main(String[] args) {

        Computer obj = new Computer();
        obj.Music();

        String str = obj.GetMeAPen(6);
        System.out.println(str);
    }
}
