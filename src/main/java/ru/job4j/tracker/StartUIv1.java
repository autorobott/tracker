package ru.job4j.tracker;

public class StartUIv1 {
    private final Output out;

    public StartUIv1(Output pOut) {
        out = pOut;
    }

    public void init(Input pInput, Tracker pTracker, UserAction[] pActions) {
        boolean run = true;
        while (run) {
            showMenu(pActions);
            int select = pInput.askInt("Select: ");
            if ((select < 0) || (select >= pActions.length)) {
                out.printLn("Wrong input, you can select: 0 .. " + (pActions.length - 1));
                continue;
            }
            UserAction action = pActions[select];
            run = action.execute(pInput, pTracker);
        }
    }

    private void showMenu(UserAction[] pAction) {
        out.printLn("Menu.");
        for (int index = 0; index < pAction.length; index++) {
            out.printLn(index + ". " + pAction[index].name());
        }
    }

    public static void main(String[] args) {
        Output output = new ConsoleOutput();
        Input input = new ValidateInput();
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(output),
                new DeletAction(output),
                new FindAction(output),
                new EditAction(output),
                new FindIAction(output),
                new FindNAction(output),
                new ExitAction(output)
        };
        new StartUIv1(output).init(input, tracker, actions);
    }
}
