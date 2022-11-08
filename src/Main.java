import transport.Auto;

public class Main {
    public static void main(String[] args) {
        Meet maksim = new Meet("Максим", "Минск", 1988, "бренд менеджер");
        Meet anna = new Meet("Аня", "Москва", 1993, "методист по образовательной программе");
        Meet katy = new Meet("Катя", "Калининград", 1995, "продакт-менеджер");
        Meet artem = new Meet("Артем", "Москва", 1995, "директор по развитию бизнеса");
        Meet vladimir = new Meet("Владимир", "Казань", 1995, null);

        printInfo(maksim);
        printInfo(anna);
        printInfo(katy);
        printInfo(artem);
        printInfo(vladimir);



        Auto lada = new Auto("Lada ","Granta ","1,7L","Желтая",2015," Россия",null,null,null,0,false,null,null);
        Auto audi = new Auto("Audi ","А8 50 L TDI quattro","3,0L","Черный",2021," Германия",null,null,null,0,false,null,null);
        Auto bmw = new Auto("BMW ","Z8 ","3,0L","Черный",2021," Германия",null,null,null,0,false,null,null);
        Auto kia = new Auto("Kia ","Sportage 4-го поколения ","2,4L","Красный",2018," Корея",null,null,null,0,false,null,null);
        Auto hyundai = new Auto("Hyundai ","Avante ","1,6L","Оранжевый",2016," Корея",null,null ,null,0,false,null,null);
        printInfo(lada);
        printInfo(audi);
        printInfo(bmw);
        printInfo(kia);
        printInfo(hyundai);




        Flower rosa = new Flower(null, "Голландия", 35.59, 0);
        Flower chrysanthemums = new Flower(null, null, 15, 5);
        Flower pion = new Flower(null, "Англия", 69.9, 1);
        Flower gypsophila = new Flower(null, "Турция", 19.5, 10);


        printInfo(rosa);
        printInfo(chrysanthemums);
        printInfo(pion);
        printInfo(gypsophila);

        System.out.println();
        costFlowers(
                rosa,rosa,rosa,chrysanthemums,chrysanthemums,chrysanthemums,chrysanthemums,chrysanthemums,gypsophila
        );


    }

    private static void printInfo(Meet meet) {
        System.out.println("Привет! Меня зовут " + meet.name + "Я из города " + meet.getTown() + " Я родился в " + meet.getYearOfBirth() + " году. Я работаю на должности " + meet.jobTitle + ". Будем знакомы!");
    }

    private static void printInfo(Flower flower) {
        System.out.println("Цвет " + flower.getFlowerColor() + " , страна: " + flower.getCountry() + ",стоимость за штуку: " + flower.getCost() + ", срок стояния цветка: " + flower.getLifeSpan());
    }
    private static void costFlowers(Flower...flowers) {
        double totalCost = 0;
        int minLifeSpan = Integer.MAX_VALUE;
        for (Flower flower : flowers) {
            if (flower.getLifeSpan() < minLifeSpan) {
                minLifeSpan = flower.getLifeSpan();
            }
            totalCost += flower.getCost();
            printInfo(flower);
        }
        totalCost = totalCost * 1.1;
        System.out.println("Стоимость букета " + totalCost);
        System.out.println("Срок стояния букета "+ minLifeSpan);
    }
    private static void printInfo (Auto auto) {
        System.out.println(
                auto.getBrand()+ " " +auto.getModel()+ " " +auto.getEngineModel() +" " +auto.getColor() +" "+auto.getCountry()
                +auto.getGear()+ " "+auto.getBody()+ " "+auto.getAutoNumber()+ " "+auto.getSeats() + " "+auto.isTyres()+""+
                        auto.getKey()+ " " + auto.getInsurance()
        );
    }

// String engineModel, String color, int year, String country
}