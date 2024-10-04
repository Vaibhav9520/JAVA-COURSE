import java.util.*;
import java.io.*;

public class FileExample {
    public static void main(String[] args) throws FileNotFoundException {
        File myFile = new File("input.txt");

        Scanner sc = new Scanner(myFile);
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            System.out.println(line);
        }
        sc.close();
    }
}
