package org.example;

public abstract class TextDecorator implements IText {
    protected final IText text;

    public TextDecorator(IText text) {
        this.text = text;
    }

    @Override
    public String transform(){
        return text.transform();
    }
}
