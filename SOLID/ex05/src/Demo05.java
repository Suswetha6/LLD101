
public class Demo05 {
    static int areaAfterResize(Shape s){
        return s.area();
    }
    public static void main(String[] args) {
        Shape r = new Rectangle(4, 5);
        Shape sq = new Square(4);

        System.out.println(areaAfterResize(r));
        System.out.println(areaAfterResize(sq));
    }
}
