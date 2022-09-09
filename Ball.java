public class Ball {
    private  int radius;
    private String color;

    public Ball(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public Ball(int radius) {
        this.radius = radius;
        this.color = "Blue";
    }
    public Ball(String color) {
        this.radius = 1;
        this.color = color;
    }
    public Ball() {
        this.radius = 1;
        this.color = "Blue";
    }
    public int get_r() {
        return radius;
    }
    public void set_r(int radius) {
        this.radius = radius;
    }
    public String get_color() {
        return color;
    }
    public void set_color(String color) {
        this.color = color;
    }
    public String toString() {
        return "Ball" +" radius=" + radius +" color: " + color+"\n";
    }
    public int get_D(){
        return 2*radius;
    }
}