public class Ren {
    private int width;
    private int height;

    public Ren(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int calculateArea() {
        return width * height;
    }

    public int calculatePerimeter() {
        return 2 * (width + height);
    }

    public static void main(String[] args) {
        Ren rect = new Ren(5, 3);
        System.out.println("Площадь прямоугольника: " + rect.calculateArea());
        System.out.println("Периметр прямоугольника: " + rect.calculatePerimeter());
    }
}
