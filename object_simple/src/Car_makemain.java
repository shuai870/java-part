public class Car_makemain {
    String color;
    int speed;
    int seat = 5;
     public  void run(){
         System.out.println(this.color+"烟花");
     }

     public Car_makemain(String color,int speed){
         this.color = color;
         this.speed = speed;
     }

    public static void main(String[] args) {
        Car_makemain y = new Car_makemain("绿色",120);
      //  y.color ="绿色";
      //  y.speed = 120;
        Car_makemain yy = new Car_makemain("紫色",10);
      //  yy.color = "紫色";
        //  yy.speed = 10;



        y.run();
        yy.run();

    }
}
