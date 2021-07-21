package com.tutorial.visitor.secondSample;

public class Content {

    private Integer data;

    public Content(Integer data) {
        this.data = data;
    }

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public void accept(ContentVisitor visitor) {
        visitor.visit(this);
    }
}
