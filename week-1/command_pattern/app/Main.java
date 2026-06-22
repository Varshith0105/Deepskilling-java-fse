package app;

import receiver.Light;
import command.LightOnCommand;
import command.LightOffCommand;
import invoker.RemoteControl;

public class Main {
    public static void main(String[] args) {

        Light light = new Light();

        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);

        RemoteControl remote = new RemoteControl();

        // Turn ON
        remote.setCommand(lightOn);
        remote.pressButton();

        // Turn OFF
        remote.setCommand(lightOff);
        remote.pressButton();
    }
}