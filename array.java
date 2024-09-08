public class array {
    public static void main(String[] args) {

        int num[][] = new int[4][7];

        //For Random values
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 6; j++) {
                num[i][j] = (int) (Math.random() * 100);

            }

        }

        
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 6; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
    }
}