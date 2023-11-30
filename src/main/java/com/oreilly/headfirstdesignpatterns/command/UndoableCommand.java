package com.oreilly.headfirstdesignpatterns.command;

public interface UndoableCommand extends Command {

    void undo();
}
