package com.in28minutes.tips.access.package1;

class Player{
    private String name;
    private static int count;

    public Player(String name){
        this.name = name;
        count++;
    }

    public String getName() {
        System.out.println(count);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    static public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
public class StaticModifierRunner {
    public static void main(String[] args) {
        Player player1 = new Player("Xiheng");
        System.out.println(Player.getCount());
        Player player2 = new Player("Qiucen");
        System.out.println(Player.getCount());
    }
}
