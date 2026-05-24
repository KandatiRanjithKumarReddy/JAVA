import java.io.*;

public class FileHandling {
    public static void main(String[] args) throws Exception {
        // File file = new
        // File("C:\\Users\\Dell\\OneDrive\\Desktop\\Java\\Ranjith.txt");
        // System.out.println(file.exists());
        // file.createNewFile();

        // //file methods
        // if (file.exists()) {
        // System.out.println("File Name: " + file.getName());
        // System.out.println("Absolute Path: " + file.getAbsolutePath());
        // System.out.println("Writable: " + file.canWrite());
        // System.out.println("Readable: " + file.canRead());
        // System.out.println("File Size in bytes: " + file.length());
        // } else {
        // System.out.println("The file does not exist.");
        // }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Ranjith.txt"))) {
            writer.write("Low Level Design\n");
            writer.write("Patterns\n");
            writer.write("Java\n");
        }

        // Read data
        try (BufferedReader reader = new BufferedReader(new FileReader("Ranjith.txt"))) {
            String line;
            int i = 1;

            while ((line = reader.readLine()) != null) {
                System.out.println("Line " + i + ": " + line);
                i++;
            }
        }
    }
}
