package Daily_Tasks;

public class Task028_4th_April_Inheritance {
    public static void main(String[] args) {
        Father_ShinJoongHae fatherShinJoongHae = new Father_ShinJoongHae();
        Mother_HanMiMO motherHanMiMO =new Mother_HanMiMO();
        Daughter_ShinHaRi daughterShinHaRi = new Daughter_ShinHaRi();
        Son_HaMin sonHaMin = new Son_HaMin();

        fatherShinJoongHae.provideIngredients();
        motherHanMiMO.cookFood();
        motherHanMiMO.runFoodShop();
        daughterShinHaRi.researchFood();
        sonHaMin.deliverFood();

        System.out.println(motherHanMiMO.surname);


    }
}
//Parent Class -> Single Inheritance
class GrandParents{
    String surname = "Shin";

   void runFoodShop(){
       System.out.println("Running the Shin family food shop.");
   }

}
//Child class extends Paretn class -> Single Inheritance: GrandParents -> Father
class Father_ShinJoongHae extends GrandParents{

    void provideIngredients(){
        System.out.println("Father_ShinJoongHae is providing fresh ingredients");;
    }
}

// Mother_HanMiMO extends Father -> Multilevel Inheritance: GrandParents → Father → Mother
class Mother_HanMiMO extends Father_ShinJoongHae{
        void cookFood(){
            System.out.println("Mother_HanMiMO is cooking delicious meals. ");
        }
}

// Daughter_ShinHaRi extends Father -> Hierarchical Inheritance: Father → Daughter
class Daughter_ShinHaRi extends Father_ShinJoongHae{
    void researchFood(){
        System.out.println("Daughter Shin HaRi is researching new food recipes");
    }
}

// Son_HaMin also extends Father -> Hierarchical Inheritance: Father → Son
class Son_HaMin extends Father_ShinJoongHae{
    void deliverFood(){
        System.out.println("Son HaMin is delivering food to customers.");
    }
}
