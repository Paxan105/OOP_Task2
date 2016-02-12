import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Woman women = new Woman("Uly","Ivanov", 1.65f, 63.4f);
        Man man = new Man("Petro","Semenov",1.85f,85.3f);

        Human human = compatibility_test(man,women);

        if(human==null){
            System.out.println("Ничего не вышло... разбежались");
        } else System.out.println(human.toString());

    }

    static Human compatibility_test(Human human1,Human human2){
        return human1.relationship(human2);
    }


}
