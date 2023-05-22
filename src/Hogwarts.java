public abstract class Hogwarts {
    private String name;
    private int powerOfMagic;
    private int distanceOfTransgress;

    public Hogwarts(String name, int powerOfMagic, int distanceOfTransgress) {
        this.name = name;
        this.powerOfMagic = powerOfMagic;
        this.distanceOfTransgress = distanceOfTransgress;
    }

    public String getName() {
        return name;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public int getDistanceOfTransgress() {
        return distanceOfTransgress;
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "powerOfMagic=" + powerOfMagic +
                ", distanceOfTransgress=" + distanceOfTransgress +
                '}';
    }

    public abstract int calculateFacultyScore();
    public abstract void printCompareByFaculty(String firstStudent, String secondStudent);

    public abstract String getDescriptionOfStudent();

    public void compareByPowerOfMagic(Hogwarts hogwarts){
        int scoreOne = this.powerOfMagic;
        int scoreTwo = hogwarts.powerOfMagic;
        if(scoreOne > scoreTwo){
            System.out.println(this.name + " обладает большей мощностью магии, чем " + hogwarts.getName());
        } else if (scoreOne < scoreTwo) {
            System.out.println(this.name + " обладает меньшей мощностью магии, чем " + hogwarts.getName());
        } else {
            System.out.println("Волшебники обладают одинаковой мощностью магии.");
        }
    }

    public void compareByDistanceOfTransgress(Hogwarts hogwarts) {
        int scoreOne = this.distanceOfTransgress;
        int scoreTwo = hogwarts.distanceOfTransgress;
        if(scoreOne > scoreTwo){
            System.out.println(this.name + " обладает большим растоянием трансгрессии, чем " + hogwarts.getName());
        } else if (scoreOne < scoreTwo) {
            System.out.println(this.name + " обладает меньшим растоянием трансгрессии, чем " + hogwarts.getName());
        } else {
            System.out.println("Волшебники обладают одинаковым растоянием трансгрессии.");
        }
    }

    public void compareByFaculty(Hogwarts hogwarts){
        int scoreOne = this.calculateFacultyScore();
        int scoreTwo = hogwarts.calculateFacultyScore();
        if(scoreOne > scoreTwo){
            printCompareByFaculty(this.getName(), hogwarts.getName());
        } else if (scoreOne < scoreTwo) {
            printCompareByFaculty(hogwarts.getName(), this.getName());
        } else {
            System.out.println("Баллы волшебников равны.");
        }
      }
    }

