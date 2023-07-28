class Main {

    public static void print(Object... args) {
        int last = args.length;
        for (Object input : args) {
            if (last > 1) {
                System.out.print(input + " ");
            } else {
                System.out.print(input);
            }
            last--;
        }
    }

    public static void println(Object... args) {
        int last = args.length;
        for (Object input : args) {
            if (last > 1) {
                System.out.print(input + " ");
            } else {
                System.out.println(input);
            }
            last--;
        }
    }

    public static void main(String[] args) {

        print("Prints on same line");
        println("Prints then creates a new line");

    }
}