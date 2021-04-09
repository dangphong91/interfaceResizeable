public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println(circle);
        circle.resize(2);
        System.out.println(circle);
        Square square = new Square(10);
        System.out.println(square);
        square.resize(2);
        System.out.println(square);
        Rectangle rectangle = new Rectangle(10,5);
        System.out.println(rectangle);
        rectangle.resize(2);
        System.out.println(rectangle);
    }
}
