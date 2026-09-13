package sdp.assignment1;

public interface LineupBuilder {
    LineupBuilder setFormationType(String formationType);
    LineupBuilder setSetters(int count);
    LineupBuilder setOutsideHitters(int count);
    LineupBuilder setMiddleBlockers(int count);
    LineupBuilder setOpposites(int count);
    LineupBuilder setLibero(boolean hasLibero);
    LineupBuilder setTacticalNotes(String notes);

    VolleyballLineup build();
}