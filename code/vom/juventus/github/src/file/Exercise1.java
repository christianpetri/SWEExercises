package code.vom.juventus.github.src.file;

import java.io.*;

public class Exercise1 {

    public static void main(String[] args) {
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;
        byte [] outputPrefix = "Dies ist mein output:\n".getBytes();

        try {
            File inputFile = new File("src/file/input.txt");
            inputStream = new FileInputStream(inputFile);
            File outputFile = new File("src/file/output.txt");
            outputStream = new FileOutputStream(outputFile);

            outputStream.write(outputPrefix);

            int c;
            while ((c = inputStream.read()) != -1) {
                System.out.print((char)c);
                outputStream.write(c);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
