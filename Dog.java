public class Dog {
    private String name;
    private  int ages;

    public Dog(String name, int ages) {
        this.name = name;
        this.ages = ages;
    }
    public Dog(String n){
        name = n;
        ages = 0;
    }
    public Dog(){
        name = "Pup";
        ages = 0;
    }
    public String names() {
        return name;
    }
    public void set_names(String name) {
        this.name = name;
    }
    public int get_ages() {
        return ages;
    }
    public void set_ages(int ages) {
        this.ages = ages;
    }
    public String toString() {
        return "o Dog " +"name " + name +" ages:" + ages+"\n";
    }
    public String to_human(){
        return "o "+name + " ages in human years is " + ages*7 + " years.\n";
    }
}