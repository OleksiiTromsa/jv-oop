package core.basesyntax;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        Bulldozer bulldozer = new Bulldozer();
        Excavator excavator = new Excavator();
        Track track = new Track();

        List<Machine> machines = new ArrayList<>();
        machines.add(bulldozer);
        machines.add(excavator);
        machines.add(track);

        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
