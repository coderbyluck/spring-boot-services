package org.coderbyluck.services.model;

import java.math.BigInteger;

/**
 * Created by IntelliJ IDEA.
 * User: coderbyluck
 * Date: 3/16/16
 * Time: 7:18 PM
 * File Description: Greeting POJO
 */
public class Greeting {

    private BigInteger id;
    private String text;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
