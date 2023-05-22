public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, int powerOfMagic, int distanceOfTransgress, int nobility, int honor, int bravery) {
        super(name, powerOfMagic, distanceOfTransgress);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    @Override
    public String toString() {
        return "Gryffindor{" +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                "} " + super.toString();
    }

    @Override
    public String getDescriptionOfStudent() {
        return getName() + " (сила магии:" + getPowerOfMagic() + " растояние трансгрессии:" + getDistanceOfTransgress() +
                " благородство:" + getNobility() + " честь:" + getHonor() + " храбрость:" + getBravery() + ")";
    }

    @Override
    public int calculateFacultyScore() {
        return this.nobility + this.honor + this.bravery;
    }

    @Override
    public void printCompareByFaculty(String firstStudent, String secondStudent) {
        System.out.println(firstStudent + " лучший гриффиндорец, чем " + secondStudent);
    }

}
