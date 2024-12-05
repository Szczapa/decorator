package org.example;

public class SuffixDecorator extends TextDecorator{

    String suffixe;

    public SuffixDecorator(IText text, String suffixe) {
        super(text);
        this.suffixe = suffixe;
    }

    @Override
    public String transform() {
        return text.transform() + suffixe;
    }

}
