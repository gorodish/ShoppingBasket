package example.codeclan.com.shoppingbasket;

/**
 * Created by user on 17/03/2017.
 */

public abstract class Item {

    public String name;
    public int itemNo;

    public Item(String name, int itemNo) {
        this.name = name;
        this.itemNo = itemNo;
    }

    public String getName() {
        return this.name;
    }

    public int getItemNo() {
        return this.itemNo;
    }
}
