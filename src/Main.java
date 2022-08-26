public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1.1");
        var dog = 8;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        System.out.println("задание 1.2");
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        System.out.println("задача 1.3");
        var dog1 = 8.0;
        dog1 = dog1 - 3.5;
        System.out.println(dog1);
        cat = (cat - 1.6);
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        System.out.println("задание 2.4");
        var friend = 19.0;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend =  friend / 7;
        System.out.println(friend);

        System.out.println("задание 2.5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        System.out.println("задание 3.6");
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var weightOfAllBoxers = boxer1 + boxer2;
        System.out.println("общий вес боксеров " + weightOfAllBoxers);
        var weightDifference = boxer2 - boxer1;
        System.out.println("разница в весе боксеров " + weightDifference);

        System.out.println("задание 3.7");
        System.out.println("разница весов двух боксеров " + (boxer2 - boxer1));
        var difference2 = boxer2 % boxer1;
        System.out.println("разница в весе между боксерами " + difference2 + " кг");

        System.out.println("задание 3.8");
        var totalWorkingHours = 640;
        var housePerDay = 8;
        var totalEmployees = totalWorkingHours / housePerDay;
        System.out.println("всего работников в компании " + totalEmployees + " человек");
        totalEmployees = totalEmployees + 94;
        totalWorkingHours = totalEmployees * housePerDay;
        System.out.println("Если в компании работает " + totalEmployees + " человека,то всего " + totalWorkingHours + " часов работы может быть поделено между сотрудниками" );







    }


}