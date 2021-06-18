package com.tutorial.composite.secondSample;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/*
 * composite
 * */
public class MenuComponent {
    private final String url;
    private final String name;
    protected List<MenuComponent> children = new ArrayList<>();

    public MenuComponent(String url, String name) {
        this.url = url;
        this.name = name;
    }

    public MenuComponent add(MenuComponent menuComponent) {
        throw new IllegalStateException("Not supported in this level");
    }

    public MenuComponent remove(MenuComponent menuComponent) {
        throw new IllegalStateException("Not supported in this level");
    }

    public String print() {
        return String.format("%s->%s \n", this.name, this.url);

    }

    public String getUrl() {
        return url;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuComponent that = (MenuComponent) o;
        return Objects.equals(url, that.url) &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, name);
    }

    @Override
    public String toString() {
        return "MenuComponent{" +
                "url='" + url + '\'' +
                ", name='" + name + '\'' +
                ", children=" + children +
                '}';
    }
}
