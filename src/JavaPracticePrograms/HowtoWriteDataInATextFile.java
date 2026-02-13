package JavaPracticePrograms;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class HowtoWriteDataInATextFile {
    public static void main(String [] args) throws IOException {
        FileWriter file = new FileWriter("C:\\JavaPractice\\Test123.text");
        BufferedWriter bw = new BufferedWriter(file);

        bw.write("Welcome to Java");
        bw.write("Code will execute");
        bw.write("I am Indhu");
        System.out.println("Finished!!!");
        bw.close();
    }
}
