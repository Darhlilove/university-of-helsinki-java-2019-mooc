
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    @Override
    public String toString() {
        if (elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        }

        String elementItems = String.join("\n", elements);

        String intro = String.format(
                "The collection %s has %d element%s:\n",
                this.name,
                elements.size(),
                elements.size() == 1 ? "" : "s"
        );

        return intro + elementItems;
    }

}
