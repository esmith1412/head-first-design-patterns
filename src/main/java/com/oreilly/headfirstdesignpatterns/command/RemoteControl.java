package com.oreilly.headfirstdesignpatterns.command;

import java.util.Optional;

public class RemoteControl {

    private UndoableCommand undoCommand;
    private final Command[] onCommands;
    private final Command[] offCommands;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];
        var noCommand = new NoCommand();

        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public RemoteControl(int size) {
        onCommands = new Command[size];
        offCommands = new Command[size];
        var noCommand = new NoCommand();

        for (int i = 0; i < size; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setOnCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPressed(int slot) {
        var command = onCommands[slot];
        command.execute();

        if (command instanceof UndoableCommand)
            undoCommand = (UndoableCommand) command;

    }

    public void offButtonWasPressed(int slot) {
        var command = offCommands[slot];
        command.execute();

        if (command instanceof UndoableCommand)
            undoCommand = (UndoableCommand) command;

    }

    public void undoButtonWasPressed() {
        Optional.ofNullable(undoCommand).ifPresent(UndoableCommand::undo);
    }

    public String toString() {
        var stringBuilder = new StringBuilder();
        stringBuilder.append("\n------ Remote Control -------\n");

        for (int i = 0; i < onCommands.length; i++) {
            stringBuilder.append(
                String.format(
                    "[slot %s] %s %s\n", i, onCommands[i].getClass().getName(), offCommands[i].getClass().getName()
                )
            );
        }

        return stringBuilder.toString();
    }
}
