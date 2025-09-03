public class Square implements Shape {

    protected int side;

    Square(int side) {
        this.side = side; 
    }

    public int area() {
        return side * side;
    }
    
}