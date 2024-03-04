public class stringBuffer {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Ankita");

        System.out.println(sb.capacity());
        System.out.println(sb.length());
        
        sb.append(" Kumari");
        System.out.println(sb);

        sb.insert(10, " Sinha");
        System.out.println(sb);

        sb.setLength(20);
        System.out.println(sb.length());
    }
}
