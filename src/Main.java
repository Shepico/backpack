import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        Thing t1 = new Thing("book", 1, 600);
        Thing t2 = new Thing("binoculars", 2, 5000);
        Thing t3 = new Thing("aidkit", 1, 1500);
        Thing t4 = new Thing("notebook", 2, 10000);
        Thing t5 = new Thing("bowler", 1, 500);

        Stock stk = new Stock();
        stk.addThing(t1);
        stk.addThing(t2);
        stk.addThing(t3);
        stk.addThing(t4);
        stk.addThing(t5);

        stk.printStock();

    }

    public static void collect(Stock stk, ArrayList backpack){

    }
}
