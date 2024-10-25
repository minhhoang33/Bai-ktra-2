package BaiKiemTra_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        UserManager userManager = new UserManager();
        Authentication authentication = new Authentication(userManager);
        Scanner scanner = new Scanner(System.in);
        HandleRegistration handleRegistration = new HandleRegistration();
        while (true) {
            menu.displayMenu(authentication,userManager,handleRegistration,scanner);
        }
    }
}


