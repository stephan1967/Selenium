package Various;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class fileHandling {
    public static void main(String[] args) {

        // create a file object for the current location
        File file = new File("newFile.txt");

        try {

            // trying to create a file based on the object
            boolean value = file.createNewFile();
            if (value) {
                System.out.println("The new file is created.");
                // Creates a Writer using FileWriter
                String data = "This is the data in the output file";
                FileWriter output = new FileWriter("newFile.txt");

                // Writes string to the file
                output.write(data);
                System.out.println("Data is written to the file.");

                // Closes the writer
                output.close();
            }
            else {
                System.out.println("The file already exists.");
                // Creates a reader using the FileReader
                char[] array = new char[100];
                FileReader input = new FileReader("newFile.txt");

                // Reads characters
                input.read(array);
                System.out.println("Data in the file:");
                System.out.println(array);

                // Closes the reader
                input.close();
            }
        }
        catch(Exception e) {
            e.getStackTrace();
        }
    }


}
