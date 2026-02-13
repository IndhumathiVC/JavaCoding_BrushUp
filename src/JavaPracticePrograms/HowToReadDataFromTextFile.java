package JavaPracticePrograms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HowToReadDataFromTextFile {
    public static void main(String [] args) throws FileNotFoundException {
        File file = new File("C:\\JavaPractice\\Test.text");
        Scanner sc = new Scanner(file);
        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
    }
}
