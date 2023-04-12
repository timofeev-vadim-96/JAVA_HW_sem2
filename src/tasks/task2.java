//2. Дана строка json:
//        [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
//        {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
//        {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
//        Написать метод, который распарсит этот текст и, используя StringBuilder, создаст строки вида:
//        Студент [фамилия] получил [оценка] по предмету [предмет]. Например:
//        Студент Иванов получил 5 по предмету Математика.
//        Студент Петрова получил 4 по предмету Информатика.
//        Студент Краснов получил 5 по предмету Физика.

package tasks;

import java.util.HashMap;
import java.util.Map;

public class task2 {
    public static void printStudents() {
        Map<String, String> dict1 = new HashMap<String, String>();
        dict1.put("фамилия", "Иванов");
        dict1.put("оценка", "5");
        dict1.put("предмет", "Математика");
        Map<String, String> dict2 = new HashMap<String, String>();
        dict2.put("фамилия", "Петрова");
        dict2.put("оценка", "4");
        dict2.put("предмет", "Информатика");
        Map<String, String> dict3 = new HashMap<String, String>();
        dict3.put("фамилия", "Краснов");
        dict3.put("оценка", "5");
        dict3.put("предмет", "Физика");
        System.out.println("Студент " + dict1.get("фамилия") + " получил " + dict1.get("оценка") + " по предмету " + dict1.get("предмет"));
        System.out.println("Студент " + dict2.get("фамилия") + " получил " + dict2.get("оценка") + " по предмету " + dict2.get("предмет"));
        System.out.println("Студент " + dict3.get("фамилия") + " получил " + dict3.get("оценка") + " по предмету " + dict3.get("предмет"));
    }
}
