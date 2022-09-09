public class Main {
    public static void main(String[] args) {
        Ball b1 = new Ball();
        System.out.println(b1);
        b1 = new Ball(2, "Yellow");
        System.out.println(b1);
        System.out.println("D_2 ball = " + b1.get_D());

    }
}