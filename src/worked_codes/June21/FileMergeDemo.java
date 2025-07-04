package June21;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileMergeDemo
{
    public static void main(String[] args)
    {
        try
        {
            FileInputStream file1 = new FileInputStream("FileName01.txt");
            FileInputStream file2 = new FileInputStream("FileName04.txt");

            SequenceInputStream file3 = new SequenceInputStream(file1, file2);

            BufferedInputStream br1 = new BufferedInputStream ( file3 );
            BufferedOutputStream br2 = new BufferedOutputStream(Files.newOutputStream(Paths.get("FileName05.txt")));

            int ch;
            while((ch = br1.read())!=-1)
            {
                br2.write((char)ch);
            }
            br1.close();
            br2.close();
            file1.close();
            file2.close();
            System.out.println("Merge Two File Sucessfully ");
        }
        catch(IOException e)
        {
            System.out.println("Sorry..!! File Not Found...!!!");
        }
    }
}

