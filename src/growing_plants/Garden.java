package growing_plants;

public class Garden {

    // Садовод-любитель. Выращиваем растения в течение нескольких лет и
    // смотрим что будет
    //задача: выращиваем деревья и цветы. Каждый из этих видов имеет
    // следующие характеристики: displayName,height, age. Каждый из них вырастает за сезон на
    // разную высоту, одинаковую для всех деревьев и всех цветов.
    // Каждый сезон состоит из 4 времен года, в которые цветы и деревья ведут себя не всегда одиниково.
    // Сезон для цветов начинается весной, зимой они не растут, летом они не растут а цветут,
    // осенью их срезают.
    // Для деревьев: сезон начинается весной, зимой они не растут, летом растут, осенью не растут.
    // В классе Garden  создать метод growPlants, в котором подробно отражен процесс роста нескольких растений
    // в течение нескольких лет. Что происходит зимой, летом и весной, их размер в каждый сезон.
    // В классе также должна выводится на экран информация какого они размера и возраста в конце.
    // Решить задачу через абстрактные классы
    // TREE_GROW_PER_SEASON
    // doSummer; doWinter

    public static void main(String[] args) {
        Plant t1=new Tree ("Pine tree",100,1);
        Plant f1=new Flower("Tulip",0,1);

        Plant[] plants = {t1,f1};
        int yearsToGrow=2;

        growPlants(plants,yearsToGrow);
    }

    public static void growPlants(Plant[] plants, int numberOfYears){
        System.out.println("Growing plants for "+numberOfYears+" years");

        for(int i=0;i<numberOfYears;i++) {
            for (Plant plant : plants) {
                plant.doSpring();
                plant.doSummer();
                plant.doAutumn();
                plant.doWinter();
            }
        }
        for (Plant plant:plants){
            System.out.println("    "+plant.getDisplayName()+" has height: "+plant.getHeight()+
                            " and is "+plant.getAge()+ " years old");
        }
    }
}
