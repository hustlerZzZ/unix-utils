import commands.Ls;
import commands.Wc;
import commands.Cat;

public class Main {
    public static void main(String[] args) throws Exception {
        if (args.length == 0) {
            System.out.println("Available Commands: cat, ls, wc, tail, sort, grep, less");
            return;
        }
        String path;
        String command = args[0];

        if (args.length < 2)
            path = System.getProperty("user.dir");
        else
            path = args[1];

        switch (command) {
            case "wc" -> Wc.run(path);
            case "ls" -> Ls.run(path);
            case "cat" -> Cat.run(path);
            default -> System.out.println("Unknown Command :" + command);
        }
    }
}
