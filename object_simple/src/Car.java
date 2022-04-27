public class Car {
    String color;
    int speed;
    //int seat = 5;
    public void run(){
        System.out.println("胜利");
    }

    public static void main(String[] args) {
       Car c = new Car();
       c.run();
       c.color = "绿色";
       c.speed = 1;
     //  c.seat = 2;

       Car c2 = new Car();
       c2.color = "红色";
       c2.speed = 0;
      // c2.seat  = 0;
    }
}