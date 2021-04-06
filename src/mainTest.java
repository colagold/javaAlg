import java.io.*;

public class mainTest {
    public static void outArray(int[] array){
        for (int i:array
             ) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("F:\\Resources\\Code\\keras训练图像识别数据集\\label.txt");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        BufferedWriter out = new BufferedWriter(new FileWriter("label.txt"));


        String str = null;
        while((str = bufferedReader.readLine()) != null)
        {
            out.write(str.split(",")[1].split(" ")[0]+"/可回收物"+"\n");
        }
        //close
        inputStream.close();
        bufferedReader.close();
        out.close();

    }

}
