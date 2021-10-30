package com.company;

// Câu 8: Viết chương trình nhập mật khẩu, yêu cầu mật khẩu phải có từ 10 ký tự trở lên,
// Trong đó có ít nhất 1 ký tự in hoa, 1 ký tự số, 1 ký tự đặc biệt như . , - _,…
// Nếu mật khẩu ít hơn 10 ký tự thông báo mật khẩu yếu.
// Nếu thiếu một trong các ký tự trên thì thông báo mật khẩu chưa đủ mạnh

import java.util.Scanner;

public class ExerciseEight {
    static void validatePassword() {
        Scanner sc = new Scanner(System.in);
        String PASS_REGEX = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{10,}$";
        String password;
        boolean isValidPassword = false;

        while (!isValidPassword) {
            System.out.println("Nhập mật khẩu: ");
            password = sc.nextLine();

            if (password.length() < 10) {
                System.out.println("Mật khẩu yếu! Mật khẩu phải chứa 10 ký tự trở lên.");
            } else if (!password.matches(PASS_REGEX)) {
                System.out.println("Mật khẩu chưa đủ mạnh!");
                System.out.println("Mật khẩu phải chứa ít nhất 1 ký tự số, 1 ký tự in hoa và 1 ký tự đặc biệt.");
            } else {
                System.out.println("Nhập mật khẩu thành công!");
                isValidPassword = true;
            }
        }
    }
}
