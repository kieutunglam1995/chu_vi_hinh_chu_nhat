import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số tiền gửi: ");
        double soTienGui = sc.nextDouble();

        System.out.print("Nhập tỉ lệ lãi suất (% năm): ");
        double tiLeLaiSuat = sc.nextDouble();

        System.out.print("Nhập số tháng gửi: ");
        int soThangGui = sc.nextInt();

        double soTienLai = soTienGui * tiLeLaiSuat / 12 * soThangGui;

        System.out.println("Số tiền lãi là: " + soTienLai);
    }
}
