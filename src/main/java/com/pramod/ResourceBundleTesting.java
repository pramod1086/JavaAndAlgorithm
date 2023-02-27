package com.pramod;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTesting {
    public static void main(String args[]){
        ResourceBundle bundle = ResourceBundle.getBundle("messages", Locale.UK);
        String message = bundle.getString("label");
        System.out.println(message);
    }
}
