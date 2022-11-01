import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

//task1 HW
public class Main {
    public static final String FileName = "C/Users/janametz/myProjects/read_write_fileDB_27.10.2022Homework/out/production/read_write_fileDB_27.10.2022Homework";

    public static void main(String[] args) throws IOException {
        bekommeListFile();

    }

    public static void bekommeListFile() throws IOException {

        List<File> link = new LinkedList<>();

        File[] files = new File(FileName).listFiles();
        for (int i = 0; i < files.length; i++) {
            if (files[i].isFile()) {
                System.out.println("File " + files[i].getName());
            } else if (files[i].isDirectory()) {
                System.out.println("Directory " + files[i].getName());
            };
        }
        List<String> result = new LinkedList<>();
        for (File file : files) {
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                result = reader.lines().collect(Collectors.toList());

            } catch (IOException e) {
                throw new RuntimeException(e);
            }


        }
        newFileList(result);
    }

    public static void newFileList(List<String> result) {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter("another.link"));

            for (String str : result) {
                try {
                    writer.write(str + System.lineSeparator());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            writer.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        }

    }

