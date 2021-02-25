package hashcode;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileManager {
    /**
     * Creates file.
     *
     * @param fileName the name of the file
     * @return boolean if it worked or not
     */
    public static boolean createFile(final String fileName) {
        try {
            File myObj = new File(fileName);
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
                return true;
            } else {
                System.out.println("File already exists.");
                return false;
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            return false;
        }
    }

    /**
     * Reads data from file.
     *
     * @param fileName the filename (example.txt)
     * @return data from file
     */
    public static String readFile(final String fileName) {
        StringBuilder retVal = new StringBuilder();
        try {
            File myObj = new File(fileName);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                retVal.append(data);
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return retVal.toString();
    }

    /**
     * writes into given File.
     *
     * @param fileName the name of the file
     * @param input    what should be written
     * @return boolean if it worked or not
     */
    public static boolean writeIntoFile(
            final String fileName, final String input) {
        try {
            FileWriter myWriter = new FileWriter(fileName, true);
            myWriter.write(input + "\n");
            myWriter.close();
            return true;
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            return false;
        }
    }

    /**
     * Clears the given text file.
     *
     * @param fileName the filename
     * @return if it worked or not
     */
    public static boolean clearFile(final String fileName) {
        try {
            FileWriter myWriter = new FileWriter(fileName);
            myWriter.close();
            return true;
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            return false;
        }
    }
}
