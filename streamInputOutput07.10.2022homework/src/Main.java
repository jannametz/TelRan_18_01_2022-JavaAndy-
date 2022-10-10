import java.io.*;

public class Main {
    /*
    По ссылке https://drive.google.com/file/d/1XZrLLuJlHK3n35NwQAnY9t1nSwZ3-piq/view?usp=sharing
    находится файл file.dat . Ваша задача скачать этот файл.
    Ваша программа  должна записать в отдельный файл первые 601 байт,
    затем в отдельный файл записать следующие 57053 байта и оставшиеся 22494
    байта записать в следующий файл. Если все сделано правильно, у вас должно
    получиться 3 файла.
     */

    public static void main(String[] args) {
        try {
            writeFileThreeTimes();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public static void writeFileThreeTimes() throws IOException {
        try (InputStream inputS = new BufferedInputStream(new FileInputStream("file.dat"));

             OutputStream outputS = new BufferedOutputStream(new FileOutputStream("Main.class"));) {
            int temp = 0;
            int dat;
            while ((dat = inputS.read()) != -1 && temp < 601 ) {
                temp++;
                outputS.write(dat); //write something
            }
            outputS.flush();
            OutputStream outputS01 = new BufferedOutputStream(new FileOutputStream("file10.dat"));
            while ((dat = inputS.read()) != -1   && temp < 57653) {
                temp++;
                outputS01.write(dat);//write something else
            }
            outputS01.flush();
            OutputStream outputS10 = new BufferedOutputStream(new FileOutputStream("file11.dat"));
            while ((dat = inputS.read()) != -1) {
                temp++;
                outputS10.write(dat); // write something else
            }

            outputS10.flush(); // flush the stream but it does nothing
        } catch(IOException e){
            e.printStackTrace();

        }
    }
    //didn't have enough time :D   RENT LATER
}