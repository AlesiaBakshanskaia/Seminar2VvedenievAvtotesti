package org.seminar2;

import java.util.ArrayList;
import java.util.List;

public class Magazine extends NewsMakerAbstract{
    public void setMessage(String message) {
        this.message = message + " " + this.getClass().getName();
    }

}
