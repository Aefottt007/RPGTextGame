import java.util.Scanner;

public class RPGTextGame {
    private static final String[] monsterNames = {"涛姐", "天齐姐", "国林姐姐", "煜姐姐", "哲姐姐"};
    private static final int bloodGrid = 20;//创建显示血量的格子总长度
    private static Player player;
    private static Monster monster;

    public static void main(String[] args) {
        playerCreate();//创建玩家角色信息
        monsterCreate();//随机创建怪物信息
        System.out.println("你遇见了【"+monster.getName()+"】");
        for (int i = 1; player.getBlood() > 0 && monster.getBlood() > 0; i++) {
            round(i);//开始第i回合
        }
        System.out.println("游戏结束");
    }

    private static void playerCreate() {
        System.out.println("欢迎来到《RPGTextGame》\n");
        System.out.println("请先创建玩家角色：\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("您的玩家名称为：");
        String name = sc.nextLine();
        System.out.println("\n您的生命值：");
        int bloodInit = sc.nextInt();
        System.out.println("\n您的攻击力：");
        int attack = sc.nextInt();
        System.out.println("\n您的防御力：");
        int define = sc.nextInt();
        //创建玩家角色
        player = new Player(name, bloodInit, attack, define);
        System.out.println("角色创建完毕，开始您的游戏之旅吧。");
    }

    private static void monsterCreate() {
        //创建怪物的随机属性值
        monster = new Monster(monsterNames[(int) (Math.random() * (monsterNames.length - 1))], (int) (Math.random() * 98) + 1, (int) (Math.random() * 98) + 1);
        System.out.println("新的怪物已生成，勇敢的【" + player.getName() + "】，快去挑战他们叭！");
    }

    private static void round(int i) {
        System.out.println("===第"+i+"回合===");
        showBlood();//显示玩家和怪物的血量
        System.out.println("现在是你的回合");
        monster.setBlood(monster.getBlood()-player.getAttack());
        System.out.println("你对【"+monster.getName()+"】造成了"+player.getAttack()+"点伤害，现在轮到【"+monster.getName()+"】的回合了");
        player.setBlood(player.getBlood()-(monster.getAttack()-player.getDefine()));
        System.out.println("【"+monster.getName()+"】对你造成了"+(monster.getAttack()-player.getDefine())+"点伤害");
        System.out.println("第"+i+"回合结束");
    }

    private static void showBlood(){
        int j;
        //显示玩家的血量
        System.out.print("你的血量为：");
        float blood_percent_player = (float) player.getBlood() / player.getBloodInit();
        for(j=0;j<bloodGrid*blood_percent_player;j++) System.out.print("|");
        System.out.println();
        //显示怪物的血量
        System.out.print("【"+monster.getName()+"】的血量为：");
        int blood_percent_monster = monster.getBlood() / monster.getBloodInit();
        for(j=0;j<bloodGrid*blood_percent_monster;j++) System.out.print("|");
        System.out.println();
    }
}
