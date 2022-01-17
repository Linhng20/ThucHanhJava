import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        double a, b, c, x1, x2, delta;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap he so a: ");
        a =  sc.nextDouble();
        System.out.print("Nhap he so b: ");
        b= sc.nextDouble();
        System.out.print("Nhap he so c: ");
        c = sc.nextDouble();
        System.out.println("Phuong trinh bac 2 cua ban co dang: " + a + "x^2 + " + b +"x + " + c + " = 0");
        delta = Math.pow(b, 2) - 4*a*c;
        if(delta == 0) {
            x1 = -b/(2*a);
            System.out.println("Phuong trinh co 1 nghiem x1 = x2 = " +x1);
        }
        if(delta < 0) {
            System.out.println("Phuong trinh vo nghiem");
        }
        if(delta >0) {
            x1 = (-b + Math.sqrt(delta))/(2*a);
            x2 = (-b - Math.sqrt(delta))/(2*a);
            System.out.println("Phuong trinh co 2 nghiem x1= " + x1 +" và x2 = " + x2 );
        }
        System.out.println("Nguyen Dieu Linh");
    }
}
