import commands.Cat;

public class Main {
    public static void main(String[] args) throws Exception {
        if (args.length == 0) {
            System.out.println("Available Commands: cat, ls, wc, tail, sort, grep, less");
            return;
        }

        String command = args[0];
        switch (command) {
            case "cat" -> Cat.run(args[1]);
            default -> System.out.println("Unknown Command :" + command);
        }
    }
}
