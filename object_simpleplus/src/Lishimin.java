public class Lishimin extends Liyuan {
    public void makecountry(){
        super.makecountry();
        System.out.println("李世民");//子类中的方法与父类语法相同为 重写
    }
    public static void main(String[] args) {
        Lishimin lsm = new Lishimin();
        lsm.makecountry();
    }
}
