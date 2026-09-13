package sdp.assignment1;

public class Main {
    public static void main(String[] args) {
        TacticalDirector director = new TacticalDirector();

        System.out.println("--- Building Standard 5-1 Lineup via Director ---");
        LineupBuilder fiveOneBuilder = new FiveOneSchemeBuilder();
        director.constructStandardFiveOne(fiveOneBuilder);
        VolleyballLineup proLineup = fiveOneBuilder.build();
        System.out.println(proLineup);

        System.out.println("\n--- Building Custom 5-1 Lineup directly (Fluent API) ---");
        LineupBuilder customBuilder = new FiveOneSchemeBuilder()
                .setFormationType("Custom 5-1 (No Libero)")
                .setSetters(1)
                .setOpposites(1)
                .setOutsideHitters(2)
                .setMiddleBlockers(2)
                .setLibero(false)
                .setTacticalNotes("No active libero designated; middle blockers perform full back-row rotations.");
        System.out.println(customBuilder.build());
    }
}