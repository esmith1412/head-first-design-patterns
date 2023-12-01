package com.oreilly.headfirstdesignpatterns.command;

import lombok.AllArgsConstructor;

import java.util.List;
import java.util.ArrayList;

@AllArgsConstructor
public class MacroCommand implements Command {

    protected List<Command> commands;

    public MacroCommand() {
        this.commands = new ArrayList<>();
    }

    @Override
    public void execute() {
        commands.forEach(Command::execute);
    }
}
