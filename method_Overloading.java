class calculator {
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int add1(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    public double add(double n1, double n2) {
        return n1 + n2;
    }
}

public class method_Overloading {
    public static void main(String[] args) {
        calculator obj = new calculator();
        
        int r1 = obj.add(5, 6);
        int r2 = obj.add1(3, 4, 5);
        double r3 = obj.add(5, 4.8);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);

    }

}
