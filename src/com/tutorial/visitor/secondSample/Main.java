package com.tutorial.visitor.secondSample;

/*
 * element (visitable) , visitor (a thing that visits element)
 * java.lang.element , java.lang.elementVisitor
 * client , element (accept(Visitor)), visitor (visit(concrete Element))
 * */
public class Main {
    public static void main(String[] args) {
        Content content = new Content(50);
        content.accept(new AddVisitor());
        System.out.println(content.getData());

        content.accept(new ContentVisitor() {
            @Override
            public void visit(Content content) {
                content.setData(content.getData() * 2);
            }
        });
        System.out.println(content.getData());

    }
}
