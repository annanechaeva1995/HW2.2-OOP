public class Main {
    public static void main(String[] args) {

        Gryffindor harryPotter = new Gryffindor("Гарри Поттер", 100, 80, 10, 10, 10);
        Gryffindor ronaldWeasley = new Gryffindor("Рональд Уизли", 60, 90, 8, 8, 7);
        Gryffindor hermioneGranger = new Gryffindor("Гермиона Грейнджер", 90, 90, 10, 9, 10);

        Slytherin dracoMalfoy = new Slytherin("Драко Малфой",90,90,10,10,10,10,10);
        Slytherin grahamMontagu = new Slytherin("Грэхэм Монтегю",70,60,8,7,7,8,5);
        Slytherin gregoryGoyle = new Slytherin("Грегори Гойл",50,60,6,7,4,7,8);

        Hufflepuff zachariasSmith = new Hufflepuff("Захария Смит",80,80,10,9,10);
        Hufflepuff cedricDiggory = new Hufflepuff("Седрик Диггори",90,90,10,10,10);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Джастин Финч-Флетчли",80,70,7,8,9);

        Ravenclaw choChang = new Ravenclaw("Чжоу Чанг",90,80,8,9,10,10);
        Ravenclaw padmaPatil = new Ravenclaw("Падма Патил", 70,70,6,7,8,9);
        Ravenclaw marcusBelby = new Ravenclaw("Маркус Белби",80,70,8,10,10,8);

        dracoMalfoy.compareByPowerOfMagic(harryPotter);
        cedricDiggory.compareByDistanceOfTransgress(justinFinchFletchley);
        System.out.println(zachariasSmith.getName() + " " + zachariasSmith.calculateFacultyScore());
        System.out.println(choChang.getName() + " " + choChang.calculateFacultyScore());
        System.out.println(gregoryGoyle.getName() + " " + gregoryGoyle.calculateFacultyScore());
        System.out.println(hermioneGranger.getName() + " " + hermioneGranger.calculateFacultyScore());
        cedricDiggory.compareByFaculty(zachariasSmith);
        padmaPatil.compareByFaculty(marcusBelby);
        System.out.println(ronaldWeasley.getDescriptionOfStudent());
        System.out.println(grahamMontagu.getDescriptionOfStudent());

    }
}