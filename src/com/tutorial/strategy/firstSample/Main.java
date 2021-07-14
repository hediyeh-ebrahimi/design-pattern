package com.tutorial.strategy.firstSample;

/*
* strategy others call policy design pattern
* in run time change strategy
* اونجایی که ما میخوایم رفتارش عوض شه و داینامیک بهش پاس بدیم
* java.util.comparator
*
* */
public class Main {
    public static void main(String[] args) {
        SecureContent secureContent = new SecureContent("hediyeh");
        byte[] bytes = secureContent.hashContent(new MD5Hash());
        System.out.println(bytes);
        byte[] bytes0 = secureContent.hashContent(new SHA256Hash());
        System.out.println(bytes0);
    }
}
