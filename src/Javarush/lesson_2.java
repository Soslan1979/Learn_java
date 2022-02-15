package Javarush;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class lesson_2
{
    public static void main(String[] args) throws IOException
    {
        FileInputStream  fileInputStream = new FileInputStream("C:\\Users\\sosla\\OneDrive\\Рабочий стол\\Downloads\\works\\test_1.txt");
        FileOutputStream  fileOutputStream = new FileOutputStream("C:\\Users\\sosla\\OneDrive\\Рабочий стол\\Downloads\\works\\test_copy_2.txt");

        while (fileInputStream.available() > 0)
        {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
        }

        fileInputStream.close();
        fileOutputStream.close();
    }
}