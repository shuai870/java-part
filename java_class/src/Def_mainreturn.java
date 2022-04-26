public class Def_mainreturn {
    public static String buy(){
        System.out.println("我要去买烟勒");
        return "中华香烟";
    }

    public static void main(String[] args) {
       String a = buy();
        System.out.println("买的是"+a);
    }
}
