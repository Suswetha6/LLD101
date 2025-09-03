public class Rectangle implements Shape {

    protected int w, h;
    
    Rectangle(int w, int h) {
        this.w = w; 
        this.h = h;
    }
    
    public int area() {
        return w * h;
    }
}