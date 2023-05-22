public class Hufflepuff extends Hogwarts {
    private int industriousness;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int powerOfMagic, int distanceOfTransgress, int industriousness, int loyalty, int honesty) {
        super(name, powerOfMagic, distanceOfTransgress);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    @Override
    public String toString() {
        return "Hufflepuff{" +
                "industriousness=" + industriousness +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                "} " + super.toString();
    }

    public String getDescriptionOfStudent() {
        return getName() + " (сила магии:" + getPowerOfMagic() + " растояние трансгрессии:" + getDistanceOfTransgress() +
                " трудолюбие:" + getIndustriousness() + " верность:" + getLoyalty() + " честность:" + getHonesty() + ")";
    }

    @Override
    public int calculateFacultyScore() {
        return this.industriousness + this.loyalty + this.honesty;
    }

    public void printCompareByFaculty(String firstStudent, String secondStudent) {
        System.out.println(firstStudent + " лучший пуффендуец, чем " + secondStudent);
    }

}
