package com.study.patterns.command;

class SimpleRemoteControl {
    private Command command;

    void setCommand(Command command) {
        this.command = command;
    }

    void buttonWasPressed() {
        command.execute();
    }

    void undoButtonWasPressed() {
        command.undo();
    }
}
