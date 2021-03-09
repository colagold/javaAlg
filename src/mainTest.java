import java.awt.*;

public class mainTest {
    private static int cou;
    public static void main(String[] args) {
        try {
            m();
        }catch (Throwable e){
            e.printStackTrace();
            System.out.println(cou);
        }

    }
    public static void m(){
        cou++;
        m();
    }
}
