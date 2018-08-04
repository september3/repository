package String;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * java8读取文件+流
 */
public class testString2 {
    public static void main(String[] args) {

        String fileName = "D:\\IDEA0\\a.txt";
        try {
            Stream<String> stream = Files.lines(Paths.get(fileName));
            stream.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
