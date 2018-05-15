package code.vom.juventus.github.src.file;

import java.io.*;

public class Exercise2 {

    public static void main(String[] args) {
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        String outputPrefix = "Dies ist mein output:";

        try {
            File inputFile = new File("src/file/input.txt");
            fileReader = new FileReader(inputFile);
            File outputFile = new File("src/file/output.txt");
            fileWriter = new FileWriter(outputFile);

            fileWriter.write(outputPrefix);

            int c;
            while ((c = fileReader.read()) != -1) {
                System.out.print((char)c);
//                fileWriter.write(c);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
