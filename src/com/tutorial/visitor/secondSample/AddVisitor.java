package com.tutorial.visitor.secondSample;

public class AddVisitor implements ContentVisitor {
    @Override
    public void visit(Content content) {
        content.setData(content.getData() + 100);
    }
}
