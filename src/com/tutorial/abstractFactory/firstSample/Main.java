package com.tutorial.abstractFactory.firstSample;

import com.tutorial.abstractFactory.firstSample.exception.ConvertionException;
import com.tutorial.abstractFactory.firstSample.factory.ImageConvertorFactory;
import com.tutorial.abstractFactory.firstSample.factory.MediaConvertorAbstractFactory;
import com.tutorial.abstractFactory.firstSample.factory.MediaFactory;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;

/*
* factory of factories
* documentBuilder
* */
public class Main {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException, ConvertionException {

        DocumentBuilderFactory abstractFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = abstractFactory.newDocumentBuilder();
        System.out.println(abstractFactory.getClass());//class com.sun.org.apache.xerces.internal.jaxp.DocumentBuilderFactoryImpl
        System.out.println(documentBuilder.getClass());//class com.sun.org.apache.xerces.internal.jaxp.DocumentBuilderImpl

        Document parse = documentBuilder.parse(new ByteArrayInputStream(
                ("<person><firstname>hediyeh</firstname><lastname>ebrahimi</lastname></person>")
        .getBytes("UTF-8")
        ));
        parse.normalizeDocument();
        System.out.println(parse);


        MediaFactory factory = MediaConvertorAbstractFactory.createFactory(MediaConvertorAbstractFactory.MediaFactoryType.IMAGE);
        Converter convertor = factory.createConvertor(new File("c://h.bmp"), Converter.codecType.JPG);
        byte[] convert = convertor.convert();
        System.out.println(factory.getClass());
        System.out.println(convertor.getClass());
        System.out.println(convert.getClass());


    }
}
