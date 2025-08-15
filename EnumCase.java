enum Status {
    Running, Failed, Stopped, Pending;

}

public class EnumCase {
    public static void main(String[] args) {

        // Enum usage
        int i = 5;
        Status s = Status.Pending;
        System.out.println(s);
        System.out.println(s.ordinal());

        // Array
        Status[] statusArray = Status.values();
        for (Status status : statusArray) {
            System.out.println(status + " - " + status.ordinal());
        }

        // Switch case
        switch (s) {
            case Running:
                System.out.println("The process is running.");
                break;
            case Failed:
                System.out.println("The process has failed.");
                break;
            case Stopped:
                System.out.println("The process has stopped.");
                break;
            case Pending:
                System.out.println("The process is pending.");
                break;
        }

    }
}