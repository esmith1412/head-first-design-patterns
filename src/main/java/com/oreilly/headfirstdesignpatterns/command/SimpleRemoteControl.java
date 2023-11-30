package com.oreilly.headfirstdesignpatterns.command;

import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SimpleRemoteControl {

    private Command slot;

    public void buttonPressed() {
        slot.execute();
    }
}
