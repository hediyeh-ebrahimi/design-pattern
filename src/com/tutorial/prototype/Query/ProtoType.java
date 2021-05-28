package com.tutorial.prototype.Query;

/*
* clone => shallow copy - propert record not copy
*
* */
public class ProtoType {
    public static void main(String[] args) {
        Statement statement = new Statement().setFrom("from person")
                .setProjection("select *");
        statement.setRecord(new Record());
        System.out.println(statement);
        System.out.println(statement.getRecord());

        Statement statement1 = statement.clone();
        System.out.println(statement1);
        System.out.println(statement1.getRecord());
    }
}
