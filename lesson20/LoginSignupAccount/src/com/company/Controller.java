package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    Scanner sc = new Scanner(System.in);
    Repository repo = new Repository();
    Validation validation = new Validation();
    Menu menu = new Menu();

    ArrayList<User> userList = repo.getData();
    String username;
    String password;
    String email;

    // Màn hình đầu tiên: Đăng nhập | Đăng ký
    public void loginSignup() {
        menu.mainMenu();
        int choice = sc.nextInt();
        sc.nextLine();


        switch (choice) {
            case 1:
                System.out.println("\nĐĂNG NHẬP");
                login();
                break;

            case 2:
                System.out.println("\nĐĂNG KÝ");
                signup();
                break;

            case 0:
                System.exit(0);
                break;

            default:
                System.out.println("Không có lựa chọn này!");
                break;
        }
    }

    // Đăng nhập
    public void login() {
        System.out.println("\nTHÔNG TIN ĐĂNG NHẬP");

        boolean isValidUsername = false;
        while (!isValidUsername) {
            System.out.println("Nhập username: ");
            username = sc.nextLine();

            for (User user : userList) {
                if (username.equals(user.getUsername())) {
                    isValidUsername = true;
                    System.out.println("Nhập mật khẩu: ");
                    password = sc.nextLine();

                    if (password.equals(user.getPassword())) {
                        // Đăng nhập thành công
                        successfulLogin();
                    } else {
                        System.out.println("Bạn đã nhập sai mật khẩu!");
                        failedLogin();
                    }
                    break;
                }
            }

            if (!isValidUsername) System.out.println("Bạn đã nhập sai username! Vui lòng nhập lại.\n");
        }
    }

    // Đăng nhập thành công
    public void successfulLogin() {
        System.out.println("\nĐĂNG NHẬP THÀNH CÔNG!");
        System.out.println("Chào mừng " + username + "! Bạn có thể thực hiện những công việc sau: ");

        menu.SuccessfulLoginMenu();
        int taskNumber = sc.nextInt();
        sc.nextLine();

        switch (taskNumber) {
            case 1:
                // Thay đổi username
                System.out.println("\nThay đổi username");
                updateUsername();
                break;

            case 2:
                // Thay đổi email
                System.out.println("\nThay đổi email");
                updateEmail();
                break;

            case 3:
                // Thay đổi mật khẩu
                System.out.println("\nThay đổi mật khẩu");
                updatePassword();
                break;

            case 4:
                // Đăng xuất
                System.out.println("\nĐăng xuất thành công!");
                loginSignup();
                break;

            case 0:
                System.exit(0);
                break;

            default:
                System.out.println("Không có lựa chọn này!");
                break;
        }
    }

    // Khi nhập sai mật khẩu, đăng nhập thất bại
    public void failedLogin() {
        menu.failedLoginMenu();
        int task = sc.nextInt();
        sc.nextLine();

        switch (task) {
            case 1:
                // Đăng nhập lại
                System.out.println("\nXin mời đăng nhập lại");
                login();
                break;

            case 2:
                // Quên mật khẩu
                handleForgotPassword();
                break;

            case 0:
                System.exit(0);
                break;

            default:
                System.out.println("Không có lựa chọn này!");
                break;
        }
    }

    // Quên mật khẩu
    public void handleForgotPassword() {
        boolean isRightEmail = false;

        while (!isRightEmail) {
            System.out.println("Mời nhập email của bạn: ");
            email = sc.nextLine();

            for (User user : userList) {
                if (email.equals(user.getEmail())) {
                    isRightEmail = true;

                    boolean isValidNewPass = false;
                    while (!isValidNewPass) {
                        try {
                            System.out.println("Mời nhập mật khẩu mới: ");
                            String newPassword = validation.validatePassword(sc.nextLine());

                            isValidNewPass = true;
                            user.setPassword(newPassword);
                            password = newPassword;
                            System.out.println("Thay đổi mật khẩu thành công! Vui lòng đăng nhập lại.");
                            login();

                        } catch (RuntimeException e) {
                            System.out.println(e.getMessage());
                            System.out.println("Vui lòng nhập lại mật khẩu!\n");
                        }
                    }
                }
            }

            if (!isRightEmail) System.out.println("Bạn đã nhập sai email. Vui lòng nhập lại.\n");
        }
    }

    // Thay đổi username
    public void updateUsername() {
        boolean isValidNewUsername = false;
        String newUsername = null;

        while (!isValidNewUsername) {
            System.out.println("Mời nhập username mới: ");
            newUsername = sc.nextLine();

            // Kiểm tra đúng username hiện tại mới cho thay đổi
            for (User curUser : userList) {
                if (username.equals(curUser.getUsername())) {
                    // Kiểm tra xem newUsername có bị trùng với tất cả các username đang tồn tại không
                    try {
                        for (User user : userList) {
                            if (newUsername.equals(user.getUsername()))
                                throw new RuntimeException("Username đã tồn tại trên hệ thống!");
                        }

                        isValidNewUsername = true;
                        curUser.setUsername(newUsername);
                        username = newUsername;
                        System.out.println("Thay đổi username thành công! Vui lòng đăng nhập lại.");
                        login();

                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                        System.out.println("Vui lòng nhập lại.\n");
                    }
                }
            }
        }
    }

    // Thay đổi email
    public void updateEmail() {
        boolean isValidNewEmail = false;
        String newEmail = null;

        while (!isValidNewEmail) {
            try {
                System.out.println("Mời nhập email mới: ");
                newEmail = validation.validateEmail(sc.nextLine());

                // Kiểm tra đúng username hiện tại mới cho thay đổi
                for (User curUser : userList) {
                    if (username.equals(curUser.getUsername())) {
                        // Kiểm tra xem newEmail có bị trùng với tất cả các email đang tồn tại không
                        for (User user : userList) {
                            if (newEmail.equals(user.getEmail()))
                                throw new RuntimeException("Email đã tồn tại trên hệ thống!");
                        }

                        isValidNewEmail = true;
                        curUser.setEmail(newEmail);
                        email = newEmail;
                        System.out.println("Thay đổi email thành công! Vui lòng đăng nhập lại.");
                        login();
                    }
                }

            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
                System.out.println("Vui lòng nhập lại.\n");
            }
        }
    }

    // Thay đổi mật khẩu
    public void updatePassword() {
        boolean isRightOldPass = false;

        while (!isRightOldPass) {
            String newPassword = null;
            System.out.println("Nhập mật khẩu cũ: ");
            password = sc.nextLine();

            for (User user : userList) {
                // Kiểm tra đúng username hiện tại và password thì mới đổi password
                if (password.equals(user.getPassword()) && username.equals(user.getUsername())) {
                    isRightOldPass = true;

                    boolean isValidNewPassWord = false;
                    while (!isValidNewPassWord) {
                        try {
                            System.out.println("Nhập mật khẩu mới: ");
                            newPassword = validation.validatePassword(sc.nextLine());

                            isValidNewPassWord = true;

                        } catch (RuntimeException e) {
                            System.out.println(e.getMessage());
                            System.out.println("Vui lòng nhập lại mật khẩu mới!\n");
                        }
                    }

                    user.setPassword(newPassword);
                    password = newPassword;
                    System.out.println("Thay đổi mật khẩu thành công! Vui lòng đăng nhập lại.");
                    login();
                }
            }

            if (!isRightOldPass) System.out.println("Bạn đã nhập sai mật khẩu cũ. Vui lòng nhập lại.\n");
        }
    }


    // Đăng ký (tạo tài khoản mới)
    public void signup() {
        String newUsername = null;
        String newEmail = null;
        String newPassword = null;

        System.out.println("\nMỜI NHẬP THÔNG TIN ĐĂNG KÝ TÀI KHOẢN MỚI");
        boolean isValidInfo = false;

        while (!isValidInfo) {
            try {
                System.out.println("Nhập username: ");
                newUsername = sc.nextLine();

                System.out.println("Nhập email: ");
                newEmail = validation.validateEmail(sc.nextLine());

                System.out.println("Nhập mật khẩu: ");
                newPassword = validation.validatePassword(sc.nextLine());

                // Kiểm tra email/username có tồn tại trên hệ thống chưa
                for (User user : userList) {
                    if (user.getUsername().equals(newUsername))
                        throw new RuntimeException("Username đã tồn tại trên hệ thống!");
                    if (user.getEmail().equals(newEmail)) throw new RuntimeException("Email đã tồn tại trên hệ thống!");
                }

                isValidInfo = true;

            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
                System.out.println("Vui lòng nhập lại thông tin!\n");
            }
        }

        // Nếu thông tin đúng hết, tạo tài khoản mới:
        userList.add(new User(newUsername, newEmail, newPassword));
        System.out.println("\nĐĂNG KÝ THÀNH CÔNG!");
        System.out.println("Vui lòng đăng nhập!");
        login();
    }
}
