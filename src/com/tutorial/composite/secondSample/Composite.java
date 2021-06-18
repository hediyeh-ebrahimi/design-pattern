package com.tutorial.composite.secondSample;

/*
* hierarchical system
* recursive
*
* component -> operation()
* leaf implements component -> operation()
* composite implements component -> operation(),add(),remove(),getChild()
* */
public class Composite {
    public static void main(String[] args) {
        Menu menu = new Menu("/transfer","Transfer Money");
        menu.add(new MenuItem("/card-to-card","Card To Card"))
        .add(new MenuItem("/account","By Account Number"));

        Menu subMenu = new Menu("/by_iban","By Iban");
        subMenu.add(new MenuItem("/paya","Paya"))
                .add(new MenuItem("/satna","Satna"));

        menu.add(subMenu);

        System.out.println(menu.toString());
    }
}
