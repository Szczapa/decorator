package org.example;

public class DefaultText implements IText {

    private String text;

    public DefaultText(String text) {
        this.text = text;
    }

    @Override
    public String transform(){
        return text;
    };

}
