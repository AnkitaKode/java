class switch_statement {
    public static void main(String[] args) {
        String day = "Wednesday";
        String result = "";

        result = switch (day) {
            case "Monday":
                yield "6am";
            case "Tuesday", "Wednesday":
                yield "7am";
            default:
                yield "5am";

        };
        System.out.println(result);

        // switch (day) {
        // case "Monday" -> result = "6am";
        // case "Tuesday", "Wednesday" -> result = "7am";
        // default -> result = "5am";

        // }
        // System.out.println(result);

        /*
         * switch (day) {
         * case "Monday" -> System.out.println("6am");
         * 
         * case "Tuesday", "Wednesday" -> System.out.println("7am");
         * 
         * default -> System.out.println("6:30am");
         * 
         * }
         */

        /*
         * General Form
         * int n = 3;
         * switch (n) {
         * case 1:
         * System.out.println("Monday");
         * break;
         * case 2:
         * System.out.println("Tuesday");
         * break;
         * case 3:
         * System.out.println("Wednesday");
         * break;
         * case 4:
         * System.out.println("Thursday");
         * break;
         * case 5:
         * System.out.println("Friday");
         * break;
         * case 6:
         * System.out.println("Saturday");
         * break
         * default:
         * System.out.println("Sunday")
         * }
         */
    }
}