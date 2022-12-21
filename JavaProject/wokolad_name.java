import java.io.*;
import java.util.Scanner;

public class wokolad_name
{
    public static void main(String[] args)
    {
        Show_full_info("Wokolad_info.txt");
    }

    public static long numOfLines(String fileName)
    {
    //Hell nahhh
        //come on
        long lines = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            while (reader.readLine() != null) lines++;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines/8;
    }
    public static void Show_info(String filename)
    {
        try {
            FileReader reader = new FileReader(filename);
            int data = reader.read();
            while(data != -1) {
                System.out.print((char)data);
                data = reader.read();
            }
            reader.close();

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public static void Show_full_info(String filename)
    {
        long num = numOfLines(filename);
        System.out.println("Total number of wokolad types: " + num);
        Show_info(filename);
    }

    public static void Sale (String sale_name) throws IOException
    {
        FileWriter fw = new FileWriter("Wokolad_info.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);
    }

    public void first (String a)
    {
        try
        {
            BufferedReader reader = new BufferedReader(new FileReader("Wokolad_info.txt"));
            String line = reader.readLine();
            while(line != null)
            {
                if(line.equals(a))
                {
                    // do something
                    for (int i = 0; i < 8; i++)
                    {
                        System.out.println(line);
                        line=reader.readLine();
                    }

                }
                line=reader.readLine();

            }

        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }


}
