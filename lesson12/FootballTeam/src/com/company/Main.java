package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Team team = new Team();
        team.getAllPlayers();

        while (true) {
            menu();
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Mô hình 4-4-2: 1GK - 4DF - 4MF - 2FW: ");
                    team.showPlayers(team.selectMainTeam(4, 4, 2));
                    break;
                case 2:
                    System.out.println("Mô hình 4-3-3: 1GK - 4DF - 3MF - 3FW: ");
                    team.showPlayers(team.selectMainTeam(4, 3, 3));
                    break;
                case 3:
                    System.out.println("Mô hình 3-5-2: 1GK - 3DF - 5MF - 2FW: ");
                    team.showPlayers(team.selectMainTeam(3, 5, 2));
                    break;
                case 4:
                    System.out.println("In thông tin toàn bộ cầu thủ trong đội: ");
                    team.showPlayers(team.allPlayers);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có lựa chọn này!");
                    break;
            }
        }
    }

    public static void menu() {
        System.out.println("\n----- FOOTBALL TEAM -----");
        System.out.println("Xin mời lựa chọn: ");
        System.out.println("1 - Mô hình 4-4-2: 1GK - 4DF - 4MF - 2FW");
        System.out.println("2 - Mô hình 4-3-3: 1GK - 4DF - 3MF - 3FW");
        System.out.println("3 - Mô hình 3-5-2: 1GK - 3DF - 5MF - 2FW");
        System.out.println("4 - In ra thông tin toàn bộ cầu thủ");
        System.out.println("0 - Kết thúc chương trình");
    }
}
