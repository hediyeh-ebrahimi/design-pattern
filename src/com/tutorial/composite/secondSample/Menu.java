package com.tutorial.composite.secondSample;

public class Menu extends MenuComponent {
    public Menu(String url, String name) {
        super(url, name);
    }

    @Override
    public MenuComponent add(MenuComponent menuComponent) {
        this.children.add(menuComponent);
        return this;

    }

    @Override
    public MenuComponent remove(MenuComponent menuComponent) {
        this.children.remove(menuComponent);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("::menu::");
        stringBuilder.append(print());
        this.children.forEach(leaf->stringBuilder.append(leaf.toString()));
        return stringBuilder.toString();
    }
}
