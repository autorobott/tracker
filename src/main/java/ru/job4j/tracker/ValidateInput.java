package ru.job4j.tracker;

public class ValidateInput implements Input {
    private final Input in;
    private final Output out;

    public ValidateInput(Input pIn, Output pOut) {
        in = pIn;
        out = pOut;
    }

    @Override
    public String askStr(String question) {
        return in.askStr(question);
    }

    @Override
    public int askInt(String question) {
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value = in.askInt(question);
                invalid = false;
            } catch (IllegalStateException moe) {
                out.printLn("Please select key from menu.");
            } catch (NumberFormatException nfe) {
                out.printLn("Please enter validate data again.");
            }
        } while (invalid);
        return value;
    }
}
