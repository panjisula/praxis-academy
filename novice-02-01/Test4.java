class Ship4{
    public double x=0.0, y=0.0, speed=1.0, direction=0.0;
    public String name;

    public Ship4(double x, double y,
                double speed, double direction,
                String name){
                    this.x = x;
                    this.y = y;
                    this.speed = speed;
                    this.direction = direction;
                    this.name = name;
                }
    
    public Ship4(String name){
        this.name = name;
    }

    private double degreesToRadians(double degrees){
        return(degrees * Math.PI / 180.0);
    }

    public void move(){
        move(1);
    }

    public void move(int steps){
        double angle = degreesToRadians(direction);
        x = x + (double)steps * speed * Math.cos(angle);
        y = y + (double)steps * speed * Math.sin(angle);
    }

    public void printLocation(){
        System.out.println(name + " is at ("+ x + "," + y + ").");
    }
}

public class Test4{
    public static void main(String[] args){
        Ship4 s1 = new Ship4("Ship1");
        Ship4 s2 = new Ship4(0.0, 0.0, 2.0, 135.0, "Ship2");
        s1.move();
        s2.move(3);
        s1.printLocation();
        s2.printLocation();
    }
}