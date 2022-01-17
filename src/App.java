import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        String hoTen = "";
        System.out.println("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.println("Hello " +hoTen);
    }
}
