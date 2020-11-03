package com.github.gs618.sprouts.beans.sample;

import org.springframework.beans.BeanUtils;

/**
 * @author s.c.gao
 */
public class Application {

    public static void main(String[] args) {
        ObjectA objectA = new ObjectA("Hello ObjectA");
        System.out.println(objectA.toString());
        ObjectB objectB = new ObjectB(objectA, "StringInB", 100, 1000L);
        System.out.println(objectB.toString());
        ObjectD objectD = new ObjectD("StringInD");
        System.out.println(objectD.toString());

        ObjectC objectC = new ObjectC();
        System.out.println(objectC.toString());
        BeanUtils.copyProperties(objectB, objectC);
        System.out.println(objectC.toString());
        BeanUtils.copyProperties(objectD, objectC);
        System.out.println(objectC.toString());
    }

}
