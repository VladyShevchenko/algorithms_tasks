import org.testng.annotations.Test;

import java.io.File;

public class FilePrinter {
    private String directory = "C:\\Users\\vlady\\algorithms\\src\\";

    private void buildTree(String directory) {

        File rootPath = new File(directory);
        File[] list = rootPath.listFiles();

        if (list == null) return;

        for (File file : list) {
            if (file.isDirectory()) {
                buildTree(file.getAbsolutePath());
                System.out.println("DIRECTORY: " + file.getAbsoluteFile());
            } else {
                System.out.println("File: " + file.getAbsoluteFile());
            }
        }
    }

    @Test
    public void testSequences() {
        new FilePrinter().buildTree(directory);
    }
}