public class Shape {
    private String name;
    private  String inf;

    public Shape(String name, String inf) {
        this.name = name;
        this.inf = inf;
    }
    public Shape(String n){
        name = n;
        inf = " ";
    }
    public Shape(){
        name = "Pup";
        inf = "Lol";
    }
    public String names() {
        return name;
    }
    public void set_names(String name) {
        this.name = name;
    }
    public String get_inf() {
        return inf;
    }
    public void set_inf(String inf) {
        this.inf = inf;
    }
    public String toString() {
        return "o Shape " +"name " + name +"\no inf: " + inf+"\n";
    }

}