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
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(),
                new DeletAction(),
                new FindAction(),
                new EditAction(),
                new FindIAction(),
                new FindNAction(),
                new ExitAction()
        };
        new StartUIv1(output).init(input, tracker, actions);
    }
}
