package com.slackers.inc.alrorithms;

import java.util.Date;

/**
 * Created by John's New HP on 3/25/2017.
 */
public class BeverageEntityTest {

    public enum BeverageType
    {
        WINE,
        BEER,
        DISTILLED;
    }

    private String name;
    private BeverageType type;
    private Date date;

    public BeverageEntityTest(String name, BeverageType type, Date date) {
        this.name = name;
        this.type = type;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public BeverageType getType() {
        return type;
    }

    public Date getDate() {
        return date;
    }
}
