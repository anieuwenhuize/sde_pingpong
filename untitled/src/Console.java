public class Console {

    public static void write(String line) {

        System.out.println(line);
    }

    public static String read() {
        return System.console().readLine();
    }
}
