package me.easytodo.designpatterns._02_structural_patterns._08_composite._02_after;

public class Character implements Component {

    private Bag bag;

    //leaf
    @Override
    public int getPrice() {
        return bag.getPrice();
    }

}
