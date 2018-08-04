package String;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class testString1 {

    public static void main(String[] args) {
        String fileName = "D:\\IDEA0\\a.txt";

        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

//            stream.forEach(System.out::println);

            FileOutputStream fos = new FileOutputStream("D:\\IDEA0\\b.txt");

            stream.forEach(b -> {
                try {
                    fos.write(b.getBytes());

                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
