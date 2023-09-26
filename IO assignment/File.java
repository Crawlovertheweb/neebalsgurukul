package IOAssignment;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class File 
{
//	1) Given there is a file with name PopularHashTags, Read that file and create a
//	Copy of that using java IO.
//	2) Also create a Custom Reader to Read all the HashTags from that file.
	
    public static void main(String[] args) throws IOException 
    {
    	//problem 1
        FileInputStream f = new FileInputStream("D:\\Javacodes\\neebalgurul\\src\\IOAssignment\\PopularHashTags.txt");
        FileOutputStream f2 = new FileOutputStream("D:\\Javacodes\\neebalgurul\\src\\IOAssignment\\PopularHashTags1.txt");

        int i = 0;
        while ((i = f.read()) != -1) {
            f2.write(i);
        }
        f.close();
        f2.close();

  //problem 2      
        String line;
        FileInputStream f3 = new FileInputStream("D:\\Javacodes\\neebalgurul\\src\\IOAssignment\\PopularHashTags1.txt");
        InputStreamReader inputStreamReader = new InputStreamReader(f3);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.println("Hashtags in the copied file:");
        while ((line = bufferedReader.readLine()) != null) {
            String words[] = line.split("\\s+");
            for (String word : words) {
                if (word.startsWith("#")) {
                    System.out.println(word);
                }
            }
        }
        bufferedReader.close();
        f3.close();
    }
}
