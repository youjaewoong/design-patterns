package me.easytodo.designpatterns._02_structural_patterns._08_composite._02_after;

import java.util.ArrayList;
import java.util.List;

public class Bag implements Component {

	//Component 를 참조
    private List<Component> components = new ArrayList<>();

    public void add(Component component) {
        components.add(component);
    }

    public List<Component> getComponents() {
        return components;
    }

    //leaf
    @Override
    public int getPrice() {
        return components.stream().mapToInt(Component::getPrice).sum();
    }
}
