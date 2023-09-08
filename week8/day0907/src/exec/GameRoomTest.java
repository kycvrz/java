package exec;

import java.util.Scanner;

public class GameRoomTest {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        System.out.println("欢迎斗地主");
        System.out.println("请选择模式：");
        System.out.println("1.经典模式");
        System.out.println("2.组队模式");
        System.out.println("3.连炸玩法");
        System.out.println("4.好友同玩");
        System.out.println("5.旅行地主");
        System.out.println("请输出模式序号");
        int type = sc.nextInt();
        switch (type) {
            case 1 -> classicModel();
        }
    }

    public static void classicModel() {
        GameRoom gameRoom = new GameRoom();
        System.out.println("开始游戏");
        gameRoom.dealCards();// 发牌
        gameRoom.strokeCards(); // 捋牌
        System.out.println("玩家1：" + gameRoom.getPlayerList1());
        System.out.println("玩家2：" + gameRoom.getPlayerList2());
        System.out.println("玩家3：" + gameRoom.getPlayerList3());
        outer:
        for (int i = 0; i < 4; i++) {
            System.out.println(gameRoom.getList());
            if (i == 0) {
                snatchLandlord();
                int type = sc.nextInt();
                switch (type) {
                    case 1 -> {
                        gameRoom.getPlayerList1().addAll(gameRoom.getList());
                        gameRoom.strokeCards1();
                        System.out.println(gameRoom.getPlayerList1());
                        break outer;
                    }
                    case 2 -> {
                        continue outer;
                    }
                }
            } else if (i == 1) {
                snatchLandlord1();
                int type = sc.nextInt();
                switch (type) {
                    case 1 -> {
                        gameRoom.getPlayerList2().addAll(gameRoom.getList());
                        gameRoom.strokeCards2();
                        System.out.println(gameRoom.getPlayerList2());
                        break outer;
                    }
                    case 2 -> {
                        continue outer;
                    }
                }
            } else if (i == 2) {
                snatchLandlord1();
                int type = sc.nextInt();
                switch (type) {
                    case 1 -> {
                        gameRoom.getPlayerList3().addAll(gameRoom.getList());
                        gameRoom.strokeCards3();
                        System.out.println(gameRoom.getPlayerList2());
                        break outer;
                    }
                    case 2 -> {
                        continue outer;
                    }
                }
            } else {
                gameRoom.getPlayerList1().addAll(gameRoom.getList());
                gameRoom.strokeCards1();// 捋牌
                System.out.println(gameRoom.getPlayerList1());
                break outer;
            }
        }
    }

    public static void snatchLandlord() {
        System.out.println("请输入抢地主序号");
        System.out.println("1.叫地主");
        System.out.println("2.不叫");
    }
    public static void snatchLandlord1(){
        System.out.println("请输入抢地主序号");
        System.out.println("1.抢地主");
        System.out.println("2.不叫");
    }
}
