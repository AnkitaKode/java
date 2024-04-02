class Calculator {
    public int add(int i, int j) {
        return i + j;
    }
}

class CalcAdv extends Calculator {
    public int add(int i, int j) // By removing this ,the r =i+j (from parent class) i.e.,Overriding method
    {
        return i + j + 1;
    }
}

public class OverridingMethod {
    public static void main(String[] args) {
        CalcAdv obj = new CalcAdv();
        int r = obj.add(8, 9);
        System.err.println(r);
    }
}
