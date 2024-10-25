package BaiKiemTra_2;

import java.util.Scanner;

public class HandleRegistration {
    public void handleRegistration(UserManager userManager) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---- Đăng ký ----");
        System.out.print("Nhập username: ");
        String username = scanner.nextLine();

        System.out.print("Nhập email: ");
        String email = scanner.nextLine();

        System.out.print("Nhập password: ");
        String password = scanner.nextLine();

        if (userManager.registerUser(username, email, password)) {
            System.out.println("Đăng ký thành công!");
        } else {
            System.out.println("Đăng ký thất bại! Kiểm tra lại thông tin.");
        }
    }
}

