public class Main {
    public static void main(String[] args) {
        Dog d1 = new Dog("Alex", 6);
        Dog d2 = new Dog("Bibo", 9);
        Dog d3 = new Dog("Albo");
        d3.set_ages(1);
        System.out.println("Dog's name:\n");
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println("Dog's age in human:\n");
        System.out.println(d1.to_human());
        System.out.println(d2.to_human());
        System.out.println(d3.to_human());

    }
}