public class Object_test {
    String name;
    String q;
    String w;
    String e;
    String r;
    public Object_test(String name,String q,String w,String e,String r  ){
        this.name =name;
    }
    public void fight(){
        System.out.println(this.name+"上单");
    }



    public static void main(String[] args) {
            Object_test G = new Object_test("寒冰射手","1","2","3","4");
            G.fight();
    }

}
