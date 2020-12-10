import java.io.SequenceInputStream;
import java.util.Scanner;

public class dientichhinhchunhat {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập width");
        width= sc.nextFloat();
        System.out.println("nhập height");
        height=sc.nextFloat();
        float area=width*height;
        System.out.println("area:"+area);
    }
}
