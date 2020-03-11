package ru.job4j.inheritance;

public class TextReport {
    public String generate(String name, String body) {
        return name + System.lineSeparator() + body;
    }
    public static void main(String[] args) {
        HtmlReport report1 = new HtmlReport();
        String text1 = report1.generate("name", "body");
        System.out.println(text1);
        JSONReport report = new JSONReport();
        String text = report.generate("name", "body");
        System.out.println(text);
    }
}
