public class Cike extends Keyword {
    String name = "孙大圣";

    public Cike(){
        super(1);
        System.out.println("zilei");//先调用父类构造在这之前
    }
    public void chi (){
        System.out.println(this.name+"吃桃子");
    }

    public static void main(String[] args) {
        Cike a = new Cike();
        a.chi();

    }

}
