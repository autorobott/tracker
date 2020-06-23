package ru.job4j.tracker;

public class StartUIv1 {
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
        System.out.println("Menu.");
        for (int index = 0; index < pAction.length; index++) {
            System.out.println(index + ". " + pAction[index].name());
        }
    }

    public static void main(String[] args) {
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
        new StartUIv1().init(input, tracker, actions);
    }
}
