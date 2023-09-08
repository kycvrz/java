package exec;

import java.util.*;
import java.util.concurrent.Callable;

public class GameRoom {
    private List playerList1 = new ArrayList();
    private List playerList2 = new ArrayList();
    private List playerList3 = new ArrayList();
    private List list = new ArrayList();

    public GameRoom() { // 初始化54张牌
        String[] colors = {"♥", "♠", "♣", "♦"};
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        for (int i = 0; i < colors.length; i++) {
            String str = colors[i];
            for (int j = 0; j < numbers.length; j++) {
                list.add(new Card(numbers[j], str, j + 1));
            }
        }
        list.add(new Card("🤡", "", 50));
        list.add(new Card("🃏", "", 100));
        Collections.shuffle(list); // 洗牌
    }

    public List getPlayerList1() {
        return playerList1;
    }

    public List getPlayerList2() {
        return playerList2;
    }

    public List getPlayerList3() {
        return playerList3;
    }

    public List getList() {
        return list;
    }

    public void dealCards() { // 发牌
        for (int i = 0; i < 17; i++) {
            playerList1.add(list.remove(0));
            playerList2.add(list.remove(0));
            playerList3.add(list.remove(0));
        }
    }

    public void watchCards() { // 看牌
        System.out.println("玩家1的牌");
        for (int i = 0; i < playerList1.size(); i++) {
            System.out.println(playerList1.get(i));
        }
        System.out.println("玩家2的牌");
        for (int i = 0; i < playerList2.size(); i++) {
            System.out.println(playerList2.get(i));
        }
        System.out.println("玩家3的牌");
        for (int i = 0; i < playerList3.size(); i++) {
            System.out.println(playerList3.get(i));
        }
    }

    public void watchCards1() { // 看牌
        System.out.println("玩家1的牌");
        for (int i = 0; i < playerList1.size(); i++) {
            System.out.println(playerList1.get(i));
        }
    }

    public void watchCards2() { // 看牌
        System.out.println("玩家2的牌");
        for (int i = 0; i < playerList2.size(); i++) {
            System.out.println(playerList2.get(i));
        }
    }

    public void watchCards3() { // 看牌
        System.out.println("玩家3的牌");
        for (int i = 0; i < playerList3.size(); i++) {
            System.out.println(playerList3.get(i));
        }
    }

    public void strokeCards() { // 捋牌
        playerList1.sort(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((Card) o2).getSize() - ((Card) o1).getSize();
            }
        });
        playerList2.sort(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((Card) o2).getSize() - ((Card) o1).getSize();
            }
        });
        playerList3.sort(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((Card) o2).getSize() - ((Card) o1).getSize();
            }
        });
    }
    public void strokeCards1() { // 捋牌
        playerList1.sort(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((Card) o2).getSize() - ((Card) o1).getSize();
            }
        });
    }
    public void strokeCards2() { // 捋牌
        playerList2.sort(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((Card) o2).getSize() - ((Card) o1).getSize();
            }
        });
    }
    public void strokeCards3() { // 捋牌
        playerList3.sort(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((Card) o2).getSize() - ((Card) o1).getSize();
            }
        });
    }
}
