package com.java24hours;

import java.net.MalformedURLException;
import java.net.URL;

public class HomeRage {
    String owner;
    URL address;
    String category = "нет";

    public HomeRage(String inOwner, String inAddress)
            throws MalformedURLException {

        owner = inOwner;
        address = new URL(inAddress);
    }

    public HomeRage(String inOwner, String inAddress,
                    String inCategory)
            throws MalformedURLException {

        this(inOwner, inAddress);
        category = inCategory;
    }
}
