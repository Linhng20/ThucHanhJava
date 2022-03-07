import java.util.Scanner;

public class AppBai3 {

    public static void main(String[] args) {
        int age, year;
        String name, ageGroup;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nhap ten: ");
        name = scanner.nextLine();
        System.out.println("Nhap nam sinh: ");
        year = scanner.nextInt();
        age = 2017 - year;  
        if (age < 16) {
            ageGroup = "vi thanh nien";
        } else if (age >= 16 || age < 18) {
            ageGroup = "truong thanh";
        } else {
            ageGroup = "cao tuoi";
        }
        
        System.out.println("Ban " + name + " thuoc nhom nguoi " + ageGroup);
    }

}