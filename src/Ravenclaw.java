public class Ravenclaw extends Hogwarts {
    private int mind;
    private int wisdom;
    private int wit;
    private int creation;

    public Ravenclaw(String name, int powerOfMagic, int distanceOfTransgress, int mind, int wisdom, int wit, int creation) {
        super(name, powerOfMagic, distanceOfTransgress);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    public int getMind() {
        return mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreation() {
        return creation;
    }

    @Override
    public String toString() {
        return "Ravenclaw{" +
                "mind=" + mind +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creation=" + creation +
                "} " + super.toString();
    }

    public String getDescriptionOfStudent() {
        return getName() + " (сила магии:" + getPowerOfMagic() + " растояние трансгрессии:" + getDistanceOfTransgress() +
                " ум:" + getMind() + " мудрость:" + getWisdom() + " остроумие:" + getWit() + " творчество:" + getCreation() + ")";
    }

    @Override
    public int calculateFacultyScore() {
        return this.mind + this.wit + this.creation + this.wisdom;
    }

    public void printCompareByFaculty(String firstStudent, String secondStudent) {
        System.out.println(firstStudent + " лучший когтевранец, чем " + secondStudent);
    }
}
