package ExcelTest2.standard;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TEST {


    public static void buildStandardList(File f) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(f));

        String content = "";
        while(content!=null){
            content = br.readLine();
            if(content ==null )break;
            System.out.println(content.trim());
        }

        br.close();

    }

    public static void main(String[] args) throws IOException {

        buildStandardList(new File("C:\\Users\\Hi\\Desktop\\data3.txt"));
    }
}
