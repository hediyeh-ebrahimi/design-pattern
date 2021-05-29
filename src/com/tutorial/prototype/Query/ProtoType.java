package com.tutorial.prototype.Query;

/*
* clone => shallow copy - propert record not copy
* deep copy => serializable
*
* */
public class ProtoType {
    public static void main(String[] args) {
        Statement statement = new Statement().setFrom("from person")
                .setProjection("select *");
        statement.setRecord(new Record());
        System.out.println(statement.hashCode());
        System.out.println(statement.getRecord().hashCode());

        Statement statement1 = statement.clone();
        System.out.println(statement1.hashCode());
        System.out.println(statement1.getRecord().hashCode());
    }
}
