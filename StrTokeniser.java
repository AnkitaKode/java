import java.util.StringTokenizer;

public class StrTokeniser {
  public static void main(String[] args) {
    StringTokenizer st = new StringTokenizer("how is the josh", " ");
    while (st.hasMoreTokens()) {
      System.out.println(st.nextToken());
    }
  }
}
