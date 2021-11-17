package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Team {
    ArrayList<Player> allPlayers;

    public ArrayList<Player> getAllPlayers() {
        allPlayers = new ArrayList<>();

        allPlayers.add(new Player(1, "Bùi Tấn Trường", Position.GK));
        allPlayers.add(new Player(2, "Đỗ Duy Mạnh", Position.DF));
        allPlayers.add(new Player(3, "Quế Ngọc Hải", Position.DF));
        allPlayers.add(new Player(4, "Bùi Tiến Dũng", Position.DF));
        allPlayers.add(new Player(5, "Phạm Xuân Mạnh", Position.DF));
        allPlayers.add(new Player(6, "Lương Xuân Trường", Position.MF));
        allPlayers.add(new Player(7, "Nguyễn Phong Hồng Duy", Position.MF));
        allPlayers.add(new Player(8, "Lê Văn Xuân", Position.MF));
        allPlayers.add(new Player(9, "Nguyễn Văn Toàn", Position.FW));
        allPlayers.add(new Player(10, "Nguyễn Công Phượng", Position.FW));
        allPlayers.add(new Player(11, "Nguyễn Tuấn Anh", Position.MF));
        allPlayers.add(new Player(12, "Nguyễn Văn Hoàng", Position.GK));
        allPlayers.add(new Player(13, "Hồ Tấn Tài", Position.DF));
        allPlayers.add(new Player(14, "Nguyễn Hoàng Đức", Position.MF));
        allPlayers.add(new Player(15, "Phạm Đức Huy", Position.MF));
        allPlayers.add(new Player(16, "Nguyễn Thành Chung", Position.DF));
        allPlayers.add(new Player(17, "Vũ Văn Thanh", Position.DF));
        allPlayers.add(new Player(18, "Hà Đức Chinh", Position.FW));
        allPlayers.add(new Player(19, "Nguyễn Quang Hải", Position.MF));
        allPlayers.add(new Player(20, "Phan Văn Đức", Position.MF));
        allPlayers.add(new Player(21, "Bùi Hoàng Việt Anh", Position.DF));
        allPlayers.add(new Player(22, "Nguyễn Tiến Linh", Position.FW));
        allPlayers.add(new Player(23, "Trần Nguyên Mạnh", Position.GK));

        return allPlayers;
    }

    // In thông tin toàn bộ cầu thủ theo theo số áo - tên - vị trí

    public void showPlayers(ArrayList<Player> list) {
        for (Player player : list) {
            System.out.println(player);
        }
    }

    // Lựa chọn 11 cầu thủ ngẫu nhiên theo các mô hình:
    // 1GK - 4DF - 4MF - 2FW  || 1GK - 4DF - 3MF - 3FW || 1GK - 3DF - 5MF - 2FW

    public ArrayList<Player> selectMainTeam(int defender, int midfield, int forwarder) {
        Random random = new Random();
        ArrayList<Player> mainTeam = new ArrayList<>();

        int goalKeeperQuantity = 0;
        int defenderQuantity = 0;
        int midfieldQuantity = 0;
        int forwarderQuantity = 0;

        while (goalKeeperQuantity < 1) {
            int randomGkIndex = random.nextInt(23);
            Player rdGoalKeeper = allPlayers.get(randomGkIndex);
            if (rdGoalKeeper.getPosition().equals(Position.GK)) {
                mainTeam.add(rdGoalKeeper);
                goalKeeperQuantity++;
            }
        }

        while (defenderQuantity < defender) {
            int randomDfIndex = random.nextInt(23);
            Player rdDefender = allPlayers.get(randomDfIndex);
            if (rdDefender.getPosition().equals(Position.DF) && !mainTeam.contains(rdDefender)) {
                mainTeam.add(rdDefender);
                defenderQuantity++;
            }
        }

        while (midfieldQuantity < midfield) {
            int randomMfIndex = random.nextInt(23);
            Player rdMidfield = allPlayers.get(randomMfIndex);
            if (rdMidfield.getPosition().equals(Position.MF) && !mainTeam.contains(rdMidfield)) {
                mainTeam.add(rdMidfield);
                midfieldQuantity++;
            }
        }

        while (forwarderQuantity < forwarder) {
            int randomFwIndex = random.nextInt(23);
            Player rdForwarder = allPlayers.get(randomFwIndex);
            if (rdForwarder.getPosition().equals(Position.FW) && !mainTeam.contains(rdForwarder)) {
                mainTeam.add(rdForwarder);
                forwarderQuantity++;
            }
        }

        return mainTeam;
    }
}
