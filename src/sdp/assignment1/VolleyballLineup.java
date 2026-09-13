package sdp.assignment1;

public class VolleyballLineup {
    private final String formationType;
    private final int setterCount;
    private final int outsideHittersCount;
    private final int middleBlockersCount;
    private final int oppositeCount;
    private final boolean hasLibero;
    private final String tacticalNotes;

    public VolleyballLineup(String formationType, int setterCount, int outsideHittersCount,
                            int middleBlockersCount, int oppositeCount, boolean hasLibero,
                            String tacticalNotes) {
        this.formationType = formationType;
        this.setterCount = setterCount;
        this.outsideHittersCount = outsideHittersCount;
        this.middleBlockersCount = middleBlockersCount;
        this.oppositeCount = oppositeCount;
        this.hasLibero = hasLibero;
        this.tacticalNotes = tacticalNotes;
    }

    public String getFormationType() {
        return formationType;
    }

    public int getSetterCount() {
        return setterCount;
    }

    public int getOutsideHittersCount() {
        return outsideHittersCount;
    }

    public int getMiddleBlockersCount() {
        return middleBlockersCount;
    }

    public int getOppositeCount() {
        return oppositeCount;
    }

    public boolean hasLibero() {
        return hasLibero;
    }

    public String getTacticalNotes() {
        return tacticalNotes;
    }

    @Override
    public String toString() {
        return String.format("Lineup [%s] -> Setters: %d, Outside: %d, Middle: %d, Opposite: %d, Libero: %b | Notes: %s",
                formationType, setterCount, outsideHittersCount, middleBlockersCount, oppositeCount, hasLibero, tacticalNotes);
    }
}