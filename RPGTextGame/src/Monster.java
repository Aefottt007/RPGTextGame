public class Monster {
    private String name;//创建怪物名称
    private int blood;//创建怪物当前血量
    private int bloodInit;//创建怪物初始血量
    private int attack;//创建怪物攻击力

    public int getBloodInit() {
        return bloodInit;
    }
    public void setBloodInit(int bloodInit) {
        this.bloodInit = bloodInit;
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

    Monster(String name,int bloodInit,int attack){
        this.name = name;
        this.bloodInit = bloodInit;
        this.attack = attack;
        this.blood = bloodInit;
    }
}
