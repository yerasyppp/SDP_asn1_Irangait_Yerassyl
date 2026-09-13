package sdp.assignment1;

public class FiveOneSchemeBuilder implements LineupBuilder {
    private static final int REQUIRED_COURT_PLAYERS = 6;

    private String formationType;
    private int setterCount;
    private int outsideHittersCount;
    private int middleBlockersCount;
    private int oppositeCount;
    private boolean hasLibero;
    private String tacticalNotes;

    @Override
    public LineupBuilder setFormationType(String formationType) {
        this.formationType = formationType;
        return this;
    }

    @Override
    public LineupBuilder setSetters(int count) {
        this.setterCount = count;
        return this;
    }

    @Override
    public LineupBuilder setOutsideHitters(int count) {
        this.outsideHittersCount = count;
        return this;
    }

    @Override
    public LineupBuilder setMiddleBlockers(int count) {
        this.middleBlockersCount = count;
        return this;
    }

    @Override
    public LineupBuilder setOpposites(int count) {
        this.oppositeCount = count;
        return this;
    }

    @Override
    public LineupBuilder setLibero(boolean hasLibero) {
        this.hasLibero = hasLibero;
        return this;
    }

    @Override
    public LineupBuilder setTacticalNotes(String notes) {
        this.tacticalNotes = notes;
        return this;
    }

    @Override
    public VolleyballLineup build() {
        int totalPlayers = setterCount + outsideHittersCount + middleBlockersCount + oppositeCount;

        // A standard volleyball team must have exactly 6 active players on the court
        if (totalPlayers != REQUIRED_COURT_PLAYERS) {
            throw new IllegalStateException("Lineup must have exactly 6 active court players.");
        }

        // 5-1 specific domain validation
        if (setterCount != 1 || oppositeCount != 1) {
            throw new IllegalStateException("A 5-1 scheme must have exactly 1 setter and 1 opposite.");
        }

        return new VolleyballLineup(formationType, setterCount, outsideHittersCount,
                middleBlockersCount, oppositeCount, hasLibero, tacticalNotes);
    }
}