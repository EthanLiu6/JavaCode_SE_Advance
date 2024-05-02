package charbuffered;

import java.io.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author EthanLiu 16693226842@163.com
 * @Date 2024/4/30 22:49
 * @Project JavaCode_SE_Advance
 * @Theme xxx
 */
public class Demo1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("day11/src/charbuffered/data.txt"));

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("day11/src/charbuffered/sorteddata.txt"));

        String[] s = bufferedReader.readLine().split(" ");
        Stream<String> stream = Stream.of(s);
        List<Integer> collect = stream.map(str -> Integer.parseInt(str))
                .sorted()
                .collect(Collectors.toList());
        String str = collect.toString();
        String nums = str.substring(1, str.length() - 1).replace(",", "");
        bufferedWriter.write(nums);
        bufferedWriter.close();
        bufferedReader.close();


    }
}
