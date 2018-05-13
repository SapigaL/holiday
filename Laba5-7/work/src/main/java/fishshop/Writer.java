package fishshop;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class Writer {
    public void writeToFile(final List<Good> goodsList) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter("D:\\qwe/list.csv"))) {

            for (int i =0 ;i<goodsList.size();i++) {

                writer.println(goodsList.get(i).getHeaders());
                writer.println(goodsList.get(i).toCVS());
                System.out.println("1");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
