package commands;

import java.io.File;
import java.nio.file.Path;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.nio.file.attribute.UserPrincipal;

public class Ls {
    public static void run(String path) throws IOException {
        File file = new File(path);

        if (!file.isDirectory()) {
            System.out.println("You cannot use ls command on a file, please specify a folder!");
            return;
        }

        File[] list = file.listFiles();
        if (list == null) {
            System.out.println("Permission denied or error accessing directory.");
            return;
        }

        System.out.println("total "+ list.length);

        for (File f : list) {
            UserPrincipal owner = Files.getOwner(Path.of(f.getAbsolutePath()));
            System.out.println(owner + " " + f.length() + " " + new SimpleDateFormat("MMM d HH:mm").format(f.lastModified()) + " " + f.getName());
        }
    }
}
