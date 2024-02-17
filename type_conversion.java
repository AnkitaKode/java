class type_conversion {
    public static void main(String[] args) {

        byte b = 125;
        int a = b;
        System.out.println(a);

        int c = 341;
        byte k = (byte) c;   // %256
        System.out.println(k);

        float f = 5.76f;
        int t = (int) f;
        System.out.println(t);
    }
}
