package com.github.gs618.sprouts.beans.sample;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

/**
 * @author sgao
 */
@Data
@AllArgsConstructor
@ToString
public class ObjectB {

    private ObjectA objectA;

    private String stringField;

    private int intField;

    private long longField;

}
