import java.util.ArrayList;
import java.util.List;

public class Stock {
    List<Thing> listThing;

    public Stock(){
        listThing = new ArrayList<>();
    }

    public void addThing (Thing newThing) {
        listThing.add(newThing);
    }

    public void printStock(){
        for (int i=0; i<listThing.size(); i++){
            System.out.println(listThing.get(i).toString());
        }
    }
}
