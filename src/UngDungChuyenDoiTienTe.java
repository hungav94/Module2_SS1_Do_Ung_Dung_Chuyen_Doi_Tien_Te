import java.util.Scanner;

public class UngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền USD");
        usd = scanner.nextDouble();
        double result = usd * 23000;
        System.out.println("Giá trị VND: " + result);
    }
}
