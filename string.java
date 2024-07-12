public class string {
    public static void main(String[] args) {

        String name = new String("Ankita");
        System.out.println(name);

        System.out.println(name.charAt(2));

        System.out.println(name.concat(" Kumari"));

        name = name + " Sinha";
        System.out.println(name);

        System.out.println(name == name);

        String name2 = "Ankita";
        System.out.println(name == name2);

        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

    }
}
