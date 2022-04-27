public class Jiangshi {
    String name;
    int hp;
    int attack;


    public Jiangshi(String name,int hp,int attack){
        this.name = name;
        this.hp = hp;
        this.attack = attack;

    }
    public void fight(Zhiwu b){
        System.out.println(this.name+"正在打"+b.name);
        b.hp = b.hp - this.attack;
        System.out.println("防御"+b.hp);
    }
}
