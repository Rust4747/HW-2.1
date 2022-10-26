import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Meet maksim = new Meet("Максим", "Минск", 1988, "бренд менеджер");
        Meet anna = new Meet("Аня", "Москва", 1993, "методист по образовательной программе");
        Meet katy = new Meet("Катя", "Калининград", 1995, "продакт-менеджер");
        Meet artem = new Meet("Артем", "Москва", 1995, "директор по развитию бизнеса");
        System.out.println("Привет! Меня зовут " + maksim.name + "Я из города " + maksim.town + " Я родился в " + maksim.yearOfBirth + " году. Я работаю на должности " + maksim.jobTitle + ". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + anna.name + "Я из города " + anna.town + " Я родился в " + anna.yearOfBirth + " году. Я работаю на должности " + anna.jobTitle + ". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + katy.name + "Я из города " + katy.town + " Я родился в " + katy.yearOfBirth + " году. Я работаю на должности " + katy.jobTitle + ". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + artem.name + "Я из города " + artem.town + " Я родился в " + artem.yearOfBirth + " году. Я работаю на должности " + artem.jobTitle + ". Будем знакомы!");




        Auto lada = new Auto("Lada ","Granta ","1,7L","Желтая",2015," Россия");
        Auto audi = new Auto("Audi ","А8 50 L TDI quattro","3,0L","Черный",2021," Германия");
        Auto bmw = new Auto("BMW ","Z8 ","3,0L","Черный",2021," Германия");
        Auto kia = new Auto("Kia ","Sportage 4-го поколения ","2,4L","Красный",2018," Корея");
        Auto hyundai = new Auto("Hyundai ","Avante ","1,6L","Оранжевый",2016," Корея");
        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);


    }

}