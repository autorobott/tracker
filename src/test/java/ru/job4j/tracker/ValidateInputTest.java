package ru.job4j.tracker;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class ValidateInputTest {
    @Test
    public void whenInvalidExit() {
        Output out = new StubOutput();
        Input in = new StabInput(
                new String[] { "1" , "0"}
        );
        Tracker tracker = new Tracker();
        UserAction[] action = {
                new ExitAction(out)
        };
        new StartUIv1(out).init(in, tracker,action);
        assertThat(out.toString(), is(
                String.format(
                                "Menu.%n"
                                + "0. Exit%n"
                                + "Wrong input, you can select: 0 .. 0%n"
                                + "Menu.%n"
                                + "0. Exit%n"
                                + "Exit. %n"
                )
        ));
    }

    @Test(expected = NumberFormatException.class)
    public void whenInvalidStrExit() {
        Output out = new StubOutput();
        Input in = new StabInput(
                new String[] {
                        "dsf"
        }
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new ExitAction(out)
        };
        new StartUIv1(out).init(in, tracker, actions);
    }

    @Test
    public void whenInvalidInput() {
        Output out = new StubOutput();
        Input in = new StabInput(
                new String[] {"one", "1"}
        );
        ValidateInput inpute = new ValidateInput(in, out);
        int selected = inpute.askInt("Enter menu:");
        assertThat(selected, is(1));
    }

    @Test
    public void whenInvalidExit1() {
        Output out = new StubOutput();
        Input in = new StabInput(
                new String[] { "asdf" , "1", "0"}
        );
        Tracker tracker = new Tracker();
        UserAction[] action = {
                new ExitAction(out)
        };
        ValidateInput input = new ValidateInput(in, out);
        new StartUIv1(out).init(input, tracker,action);
        assertThat(out.toString(), is(
                String.format(
                                  "Menu.%n"
                                + "0. Exit%n"
                                + "Please enter validate data again.%n"
                                + "Wrong input, you can select: 0 .. 0%n"
                                + "Menu.%n"
                                + "0. Exit%n"
                                + "Exit.%n"
                )
        ));
    }
}
