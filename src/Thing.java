public class Thing {

    private String name;
    private int weight;
    private int cost;

    public Thing (String name, int weight, int cost){
        this.name = name;
        this.weight = weight;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return ("" + name +
                " /W=" + weight +
                " /C=" + cost);
    }
}
