public class Square extends Rectangle implements Resizeable,Colorable {
    public Square() {
    }
    public Square(double side) {
        super(side,side);
    }
    public Square(String color, boolean filled, double side) {
        super(color,filled,side,side);
    }
    public double getSide() {
        return getWidth();
    }
    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }
    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        howToColor();
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + "A Shape with color of " + getColor() + " and " + (isFilled() ? "filled" : "not filled")
                + ", Area = "
                + getArea()
                + ", Perimeter = "
                + getPerimeter();
    }
    @Override
    public void resize(double percent) {
        this.setSide(this.getSide()*percent);
    }
    @Override
    public void howToColor() {
        System.out.print("Color all four sides ");
    }
}
