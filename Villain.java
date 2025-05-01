public class Villain {
    private int gunPower;
    private int musclePower;

    public Villain(int gunPower, int musclePower, int warTactics, int overallSmartness) {
        this.gunPower=gunPower;
        this.musclePower=musclePower;
        this.overallSmartness=overallSmartness;
        this.warTactics=warTactics;
    }


    public int getWarTactics() {
        return warTactics;
    }

    public void setWarTactics(int warTactics) {
        this.warTactics = warTactics;
    }

    public int getOverallSmartness() {
        return overallSmartness;
    }

    public void setOverallSmartness(int overallSmartness) {
        this.overallSmartness = overallSmartness;
    }

    public int getMusclePower() {
        return musclePower;
    }

    public void setMusclePower(int musclePower) {
        this.musclePower = musclePower;
    }

    public int getGunPower() {
        return gunPower;
    }

    public void setGunPower(int gunPower) {
        this.gunPower = gunPower;
    }

    private int warTactics;
    private int overallSmartness;

    public int Avg() {
        return (getGunPower() + getMusclePower() + getWarTactics() + getOverallSmartness()) / 4;
    }


}
