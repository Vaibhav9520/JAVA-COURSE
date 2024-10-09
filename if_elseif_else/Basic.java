import java.util.*;
import java.io.*;

public class Basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String FileName = sc.nextLine();
        String FileName = "first.txt";


        try{
            File file = new File(FileName);
            if(!file.exists()){
                System.out.println("File Not Exit");
                return;
            }
            
            // FileWriter fw = new FileWriter(file);
            // BufferedWriter bw = new BufferedWriter(fw);
            // String content = sc.nextLine();
            // bw.write(content);
            // bw.close();

            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            int lines = 0;
            int words = 0;
            int ch = 0;

            while((line = br.readLine()) != null){
                lines++;
                ch += line.length();

                String[] word = line.split(" ");
                words += word.length;
            }
            br.close();
            System.out.println("Lines: " + lines);
            System.out.println("Words: " + words);
            System.out.println("Characters: " + ch);

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
