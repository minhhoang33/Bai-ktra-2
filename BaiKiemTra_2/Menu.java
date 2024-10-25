package BaiKiemTra_2;

import java.util.Scanner;

public class Menu {
    UserManager userManager = new UserManager();
    Authentication authentication = new Authentication(userManager);
    HandleRegistration handleRegistration = new HandleRegistration();
    public void displayMenu(Authentication authentication, UserManager userManager, HandleRegistration handleRegistration, Scanner scanner) {
        System.out.println("1 - Đăng nhập");
        System.out.println("2 - Đăng ký");
        System.out.println("0 - Thoát chương trình");

        System.out.print("Lựa chọn của bạn: ");
        int choice = Integer.parseInt(scanner.nextLine());

        switch (choice) {
            case 1:
                User user = this.authentication.login();
                if (user != null) {
                    this.authentication.handleUserActions(user);
                }
                break;
            case 2:
                this.handleRegistration.handleRegistration(this.userManager);
                break;
            case 0:
                System.out.println("Chương trình kết thúc.");
                return;
            default:
                System.out.println("Lựa chọn không hợp lệ!");
        }
    }


}

