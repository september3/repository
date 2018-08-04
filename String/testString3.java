package String;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class testString3 {
    /**
     * java8读取文件+流+额外
     * 使用数据流过滤内容，其全部内容转换为大写并返回一个列表
     */
    public static void main(String[] args) {
        String fileName  = "D:\\IDEA0\\a.txt";
        List<String> list = new ArrayList<>();
        try {
            Stream<String> stream = Files.lines(Paths.get(fileName));

            //1. filter line 3
            //2. convert all content to upper case
            //3. convert it into a List
            list = stream.filter(line -> !line.startsWith("line3"))
                          .map(String::toUpperCase)
                          .collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
