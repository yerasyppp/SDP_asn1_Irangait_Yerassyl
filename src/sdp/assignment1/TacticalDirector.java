package sdp.assignment1;

public class TacticalDirector {

    public void constructStandardFiveOne(LineupBuilder builder) {
        builder.setFormationType("Standard 5-1")
                .setSetters(1)
                .setOpposites(1)
                .setOutsideHitters(2)
                .setMiddleBlockers(2)
                .setLibero(true)
                .setTacticalNotes("Aggressive offensive setup. Setter runs the offense from all rotations.");
    }

    public void constructAmateurFourTwo(LineupBuilder builder) {
        builder.setFormationType("Amateur 4-2")
                .setSetters(2)
                .setOpposites(0)
                .setOutsideHitters(2)
                .setMiddleBlockers(2)
                .setLibero(false)
                .setTacticalNotes("Classic 4-2 scheme without designated libero; optimized for basic rotational play.");
    }
}