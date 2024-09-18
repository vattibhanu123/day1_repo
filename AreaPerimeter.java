class Rectangle{
    private double length;
    private double breadth;
    public Rectangle(double length,double breadth){
      this.length=length;
      this.breadth=breadth;
    }

    public double area(){
        return length*breadth;
    }
    public double perimeter(){
        return 2*(length+breadth);
    }
    public void display(){
        System.out.println("length : "+length);
        System.out.println("breadth : "+breadth);
        System.out.println("area : "+area());
        System.out.println("Perimeter : "+perimeter());
    }

}

public class AreaPerimeter {
    public static void main(String[] args) {
        // Create a Rectangle object with specified dimensions
        Rectangle rect1 = new Rectangle(10,5);
        System.out.println("Rectangle 1 details:");
        rect1.display();
    }
}
