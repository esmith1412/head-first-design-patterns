package com.oreilly.headfirstdesignpatterns.command;

import java.util.Optional;

public class RemoteControl {

    private Command undoCommand;
    private final Command[] onCommands = new Command[7];
    private final Command[] offCommands = new Command[7];

    public RemoteControl() {
        var noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setOnCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPressed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPressed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPressed() {
        Optional.ofNullable(undoCommand).ifPresent( command -> {

            if (command instanceof UndoableCommand) {
                ((UndoableCommand) command).undo();
            }

        });
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
