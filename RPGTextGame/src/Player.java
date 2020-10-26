public class Player {
    private String name;//创建玩家名称
    private int blood;//创建玩家当前血量
    private int bloodInit;//创建玩家初始血量值
    private int attack;//创建玩家攻击力值
    private int define;//创建玩家防御值

    public void setBloodInit(int bloodInit) {
        this.bloodInit = bloodInit;
    }

    public int getBloodInit() {
        return bloodInit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefine() {
        return define;
    }

    public void setDefine(int define) {
        this.define = define;
    }

    //创建新的角色
    Player(String name, int bloodInit, int attack, int define) {
        this.name = name;
        this.bloodInit = bloodInit;
        this.blood = bloodInit;
        this.attack = attack;
        this.define = define;
    }
}
