public class Car_this {
    String color;
    int speed;
    int seat = 0;

    public void run(){
        System.out.println("传奇");
        System.out.println(this.color);
        System.out.println(this.speed);
    }


    public static void main(String[] args) {
        Car_this c = new Car_this();
        c.color = "红色";
        c.speed = 120;
        c.run();
        Car_this d = new Car_this();
        d.color = "绿色";
        d.speed = 10;
        d.run();
    }
}
