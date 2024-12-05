package org.example;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        
        IText text = new DefaultText("Hello, Decorator!");

        IText upperCaseText = new UpperCaseDecorator(text);
        System.out.println("Uppercase: " + upperCaseText.transform());

        IText prefixedText = new PrefixDecorator(text, "prefix_");
        System.out.println("Prefixed: " + prefixedText.transform());

        IText suffixedText = new SuffixDecorator(text, "_suffix");
        System.out.println("Suffixed: " + suffixedText.transform());

    }
}