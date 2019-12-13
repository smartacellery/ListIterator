
import java.util.ArrayList;
import java.util.ListIterator;

public class SampleIterator {

    public static void main(String[] args) {
        ArrayList<String> x = new ArrayList();
        ListIterator li = x.listIterator();
        li.add("a");
        li.add("b");
        li.add("c");
        li.previous();
        li.previous();
        li.previous();
        showList(x, li);
        System.out.println("Move 1 - travelling next over " + li.next());
        showList(x, li);
        System.out.println("Move 2 - travelling next over " + li.next());
        showList(x, li);
        System.out.println("Move 3 - removing last thing travelled " + li.next());
        li.remove();
        showList(x, li);

        System.out.println("Move 4 - Adding b to left of itinerator ");
        li.add("b");
        showList(x, li);
        System.out.println("Move 5 - travelling next over " + li.next());
        showList(x, li);
        System.out.println("Move 6 - travelling backwards over " + li.previous());

        showList(x, li);
        System.out.println("Move 7 - removing last thing travelled " + li.next());
        li.remove();
        showList(x, li);
        System.out.println("Move 8 - travelling backwards over " + li.previous());
        showList(x, li);
        System.out.println("Move 9 -modifying last thing travelled  over :b to e");
        li.set("e");
        showList(x, li);

        System.out.println("Move 10 & 11 - adding b & c to left of iterator ");
        li.add("b");
        li.add("c");
        showList(x, li);

        System.out.println("Move 12 will cause error - cant remove unless next or previous first ");
        try {
            li.remove();
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Move 13 - travelling next over " + li.next());
        showList(x, li);

        System.out.println("Move 14 will cause error - cant go nex if at end of list ");
        try {
            li.next();
        } catch (Exception e) {
            System.out.println(e);
        }
        
        System.out.println("Bonus move -travel with iterator to front of the list");
        while(li.hasPrevious())System.out.println(li.previous());;
        showList(x,li);

    }

    public static void showList(ArrayList list, ListIterator it) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (it.hasPrevious() == false && i == 0) {
                System.out.print("*|");
            }
            if (i == it.previousIndex()) {
                System.out.print("*|");
            }

        }
        System.out.println("\n--------------------------------");
    }
}
