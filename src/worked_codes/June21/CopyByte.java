package June21;

import java.io.*;
public class CopyByte
{
public static void main(String[] args)
{
    try
    {
        byte b=0;
        FileInputStream infile = new FileInputStream("FileName01.txt");
        FileOutputStream outfile = new FileOutputStream("FileName04.txt");

        FileReader byteread = new FileReader("FileName01.txt");
        while( byteread.read() != -1 )
        {
            b = (byte)infile.read();
            outfile.write(b);
        }
        System.out.println("Byte Copied From in.txt to out.txt File ");
    }
    catch(FileNotFoundException e)
    {
        System.out.println("Sorry..!! File Not Found...!!!");
    }
    catch(IOException e)
    {
        System.out.println(e.getMessage());
    }
}
}
