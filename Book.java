public class Book {
    private String name;
    private  String avtor;

    public Book(String name, String avtor) {
        this.name = name;
        this.avtor = avtor;
    }
    public Book(String n){
        name = n;
        avtor = " ";
    }
    public Book(){
        name = "Pup";
        avtor = "Lol";
    }
    public String names() {
        return name;
    }
    public void set_names(String name) {
        this.name = name;
    }
    public String get_avtor() {
        return avtor;
    }
    public void set_avtor(String avtor) {
        this.avtor = avtor;
    }
    public String toString() {
        return "Book " +"name: " + name +" \navtor: " + avtor+"\n";
    }

}