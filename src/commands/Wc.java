package commands;

import java.io.*;

public class Wc {
    public static void run(String path) throws IOException {
        File file = new File(path);
        String systemPath = System.getProperty("user.dir");

        if (file.getAbsolutePath().equals(systemPath)) {
            System.out.println("Only files can be used!");
            return;
        }

        BufferedReader br = new BufferedReader(new FileReader(path));
        int count = 0;

        while (br.readLine() != null) {
            count++;
        }

        System.out.println(count + " " + file.length() / 2 + " " + file.length() + " " + file.getName());
    }
}
