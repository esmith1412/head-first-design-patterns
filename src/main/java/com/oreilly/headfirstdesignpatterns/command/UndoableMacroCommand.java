package com.oreilly.headfirstdesignpatterns.command;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class UndoableMacroCommand extends MacroCommand implements UndoableCommand {

    @Override
    public void undo() {
        commands.forEach(command -> {

            if (command instanceof UndoableCommand) {
                ((UndoableCommand) command).undo();
            }

        });
    }
}
