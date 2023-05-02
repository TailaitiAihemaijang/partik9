import java.util.Scanner;

/**
 * ClassName: Main
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Musteqqim
 * @Create 5/2/2023 12:09 PM
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        int n1,n2,select,result;
        Scanner input = new Scanner(System.in);
        System.out.print("İlik Sayı Giriniz : ");
        n1 = input.nextInt();
        System.out.print("İkkinci Sayı Giriniz : ");
        n2 = input.nextInt();
        System.out.println("1-Toplama\n2-Cikartma\n3-Carpma\n4-Bolme");
        System.out.print("Seceniz : ");
        select = input.nextInt();
        switch (select) {
            case 1:
                result = n1 + n2;
                System.out.println(n1 + " + " + n2 + " = " + result);
                break;
            case 2:
                result = n1 - n2;
                System.out.println(n1 + " - " + n2 + " = " + result);
                break;
            case 3:
                result = n1 * n2;
                System.out.println(n1 + " * " + n2 + " = " + result);
                break;
            case 4:
                result = n1 / n2;
                System.out.println(n1 + " / " + n2 + " = " + result);
                break;
            default:
                System.out.println("Geçersiz İşlem Seçimi!");
                break;
        }
    }
}
