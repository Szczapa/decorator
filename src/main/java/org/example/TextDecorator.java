package org.example;

public abstract class TextDecorator implements IText {
    protected final IText text;

    protected TextDecorator(IText text) {
        this.text = text;
    }
}
