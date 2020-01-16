import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedInputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String filepath="./data.txt";
        try {
            BufferedReader in = new BufferedReader(new FileReader(filepath));
            Map<String, List<String>> friends=new HashMap<>();
            while(in.readLine()!=null){

            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
