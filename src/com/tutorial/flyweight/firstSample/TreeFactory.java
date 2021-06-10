package com.tutorial.flyweight.firstSample;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    public static Map<String, TreeType> treeTypeCache = new HashMap<>();//map of flyweight objects

    public static TreeType getTreeType(String name, Color color) {
        TreeType treeType = treeTypeCache.get(name);
        if (treeType != null) {
            return treeType;
        } else {
            if (treeType == null) {
                synchronized (TreeFactory.class) {
                    if (treeType == null) {
                        treeType = new TreeType(name, color);
                        treeTypeCache.put(name, treeType);
                    }
                }
            }

            return treeType;
        }

    }
}
