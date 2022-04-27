public class Zhiwu {
    String name;
    int hp;
    int attack;
    public Zhiwu(String name,int hp, int attack){
        this.name = name;
        this.hp = hp;
        this.attack = attack;
    }
    public void fight(Jiangshi a){
        System.out.println(this.name+"在干"+a.name);
        a.hp=a.hp - this.attack;
        System.out.println("僵尸剩余hp"+a.hp);
    }
}
