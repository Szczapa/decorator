package org.example;

public class PrefixDecorator extends TextDecorator{

    private final String prefix;

    public PrefixDecorator(IText text, String prefix) {
        super(text);
        this.prefix = prefix;
    }
    @Override
    public String transform() {
        return prefix + text.transform();
    }
}
