public class Slytherin extends Hogwarts {
    private int cunning;
    private int decisiveness;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String name, int powerOfMagic, int distanceOfTransgress, int cunning, int decisiveness, int ambition, int resourcefulness, int lustForPower) {
        super(name, powerOfMagic, distanceOfTransgress);
        this.cunning = cunning;
        this.decisiveness = decisiveness;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDecisiveness() {
        return decisiveness;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    @Override
    public String toString() {
        return "Slytherin{" +
                "cunning=" + cunning +
                ", decisiveness=" + decisiveness +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", lustForPower=" + lustForPower +
                "} " + super.toString();
    }

    public String getDescriptionOfStudent() {
        return getName() + " (сила магии:" + getPowerOfMagic() + " растояние трансгрессии:" + getDistanceOfTransgress() +
                " хитрость:" + getCunning() + " решительность:" + getDecisiveness() + " амбициозность:" + getAmbition() +
                " находчивость:" + getResourcefulness() + " жажда власти:" + getLustForPower() + ")";
    }

    @Override
    public int calculateFacultyScore() {
        return this.resourcefulness + this.cunning + this.decisiveness + this.ambition + this.lustForPower;
    }

    public void printCompareByFaculty(String firstStudent, String secondStudent) {
        System.out.println(firstStudent + " лучший слизеринец, чем " + secondStudent);
    }

}
