import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class items {
    public String items_name;
    public String description;

    public int items_quantity;
    public int items_price;

    public items(String items_name, String description, int items_quantity, int items_price) {
        this.items_name = items_name;
        this.description = description;
        this.items_quantity = items_quantity;
        this.items_price = items_price;
    }

    public String getItems_name() {
        return items_name;
    }

    public void setItems_name(String items_name) {
        this.items_name = items_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getItems_quantity() {
        return items_quantity;
    }

    public void setItems_quantity(int items_quantity) {
        this.items_quantity = items_quantity;
    }

    public int getItems_price() {
        return items_price;
    }

    public void setItems_price(int items_price) {
        this.items_price = items_price;
    }
}



