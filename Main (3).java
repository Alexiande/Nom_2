public class Main {
    public static void main(String[] args) {
        Shape book_1 = new Shape("triagle", "four corners and four sides");
        Shape book_2 = new Shape("circle", "without angle and without sides");
        Shape book_3 = new Shape("square","three corners and three sides");
        System.out.println(book_1);
        System.out.println(book_2);
        System.out.println(book_3);
    }
}