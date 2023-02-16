import java.util.ArrayList;
import java.util.List;

public class Cafe {
    String beginWorkDay;
    String endWorkDay;
    static List<String> weekend = new ArrayList<>();
    public static String newOpeningHours (int beginWorkDay, int endWorkDay) {
        if (beginWorkDay < endWorkDay)
            return "Новое время работы: " + beginWorkDay + ":00 - " + endWorkDay + ":00";
        else return "Неверное время окончания работы";
    }

    public static String addWeekend(String week){
        weekend.add(week);
        //делаем вывод без квадратных скобок
        String text = "";
        for(String s : weekend) {
            text = text + s;
        }
        return text;
    }

    public static String deleteWeekend(String week){
        weekend.remove(week);
        //делаем вывод без квадратных скобок
        String text = "";
        for(String s : weekend) {
            text = text + s + " ";
        }
        return text;
    }

//    public static void main(String[] args) {
//        System.out.println(addWeekend("Пн - 1-ый день"));
//        System.out.println(addWeekend("Вт - 2-ой день"));
//        System.out.println(addWeekend("Ср - 3-ий день"));
//        System.out.println(deleteWeekend("Вт - 2-ой день"));

//    }
}
