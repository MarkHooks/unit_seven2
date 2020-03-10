public class Rectangles {
    private double length;
    private double width;
    public Rectangles(double length, double width){
        this.length = length;
        this.width = width;

    }
    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }
    public double getArea(){
        return length * width;
    }
}
