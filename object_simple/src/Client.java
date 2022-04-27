public class Client {
    public static void main(String[] args) {
        Zhiwu b = new Zhiwu("射手",10,2);
        Jiangshi a = new Jiangshi("防守者",8,5);
        a.fight(b);
        b.fight(a);
    }
}
