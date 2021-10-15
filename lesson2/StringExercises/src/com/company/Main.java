package com.company;

public class Main {

    public static void main(String[] args) {
        // Bài 1: Xử lý chuỗi
        String s = "học lập trình java không khó";

        // Lấy độ dài của chuỗi
        int sLength = s.length();
        System.out.println("Độ dài của chuỗi s là: " + sLength);

        // Viết in hoa tất cả các chữ k trong chuỗi
        String sUpper = s.replaceAll("k", "k".toUpperCase());
        System.out.println("Viết in hoa tất cả các chữ k trong chuỗi s: " + sUpper);

        // Thay thế chữ "khó" thành chữ "dễ"
        String s1 = s.replaceAll("khó", "dễ");
        System.out.println("Thay thế chữ 'khó' thành chữ 'dễ': " + s1);

        // Tìm index của ký tự 'j' trong chuỗi
        System.out.println("Index của ký tự 'j' trong chuỗi s là: " + s.indexOf('j'));

        // Bài tập nâng cao, viết in hoa ký tự đầu tiên và cuối cùng của chuỗi s
        String firstUpper = s.substring(0, 1).toUpperCase();
        String lastUpper = s.substring(sLength - 1).toUpperCase();
        String s2 = firstUpper + s.substring(1, sLength - 1) + lastUpper;
        System.out.println("Viết in hoa ký tự đầu tiên và cuối cùng của chuỗi s: " + s2);

        // Ngày trong tuần
        Weekdays tuesday = Weekdays.TUESDAY;
        System.out.println("Tuesday: " + tuesday.getValue());
    }
}
