# 红岩移动第二次作业

## RPGTextGame 自动打怪文字游戏

#### 1.0

###### 创建四个类：主类（RPGTextGame.java），玩家类（Player.java），怪物类（Monster.java），背包类（Bag.java（暂时不添加此功能））

初步Player类只有四个属性：姓名，生命值，攻击力，防御力。待添加背包类和技能类。

初步Monster类只有三个类：姓名，生命值，攻击力。待添加技能类。

1.0版本玩家和怪物的属性皆由玩家自己输入，且属性间无牵制条件。

玩家进入游戏后会一直与怪物交战，**暂时无秘境，商店之类的相遇事件，后期还可增加等级和幸运值属性。**

怪物的属性皆为随机生成，**目前暂时无根据属性强弱判断怪物被击杀掉落物品好坏经验多少功能**

1.0简陋版本：<img src="./1.0简陋版本.png" alt="1.0简陋版本" style="zoom:50%;" />

需改进的地方：

-自动对战，玩家无选择，可增加选择：1.探索 2.商店 3.属性 4.退出

-血量显示方法不好，可用■与□代替，同时设置每10点生命值为一个方块  *[Solved]*

-需要添加Attack类由player和monster分别在Fight中继承，并添加判断类

-需要为玩家添加等级属性，背包类，Treasure类，同时也可以考虑为怪物添加装备

-需要为怪物设置不同的等级，完善随机生成方法，添加关卡数，前五关怪物随机生成Lv1-Lv3的等级......

-添加判断输赢的变量，在每局对战结束后进行判断，若为1则玩家胜利，获得怪物相应的宝物及Exp，若为2则玩家失败，游戏结束。

-（之后再添加）玩家的Skill类以及随机生成的怪物自带的Skill或特殊属性。

#### 2.0

**之前的设定大部分先推到重做，游戏要设计的更加方便，去掉玩家的自主选择设定，全部改为系统自动攻击和判定。**

基本功能实现完全，使用接口和继承省去了很多冗杂的代码，玩家与怪物自动对决，并添加了装备技能等操作。

