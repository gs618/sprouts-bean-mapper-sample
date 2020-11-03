package com.github.gs618.sprouts.beans.sample;

import com.github.gs618.sprouts.beans.BeanMapper;
import lombok.Data;
import lombok.ToString;

/**
 * @author sgao
 */
@Data
@ToString
public class ObjectC {

    @BeanMapper(targets = {"objectA"})
    private ObjectA objA;

    @BeanMapper(targets = {"stringField", "str"})
    private String strField;

    @BeanMapper(targets = {"intField"})
    private int iField;

}
