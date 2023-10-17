import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
public class Notebook2 {
    public static void main(String[] args) {
        NoteBook notebook1 = new NoteBook("Lenovo", 8, 256, 3.2);
        NoteBook notebook2 = new NoteBook("Honor", 16, 512, 4.0);
        NoteBook notebook3 = new NoteBook("Apple MacBook Air 13", 8, 256, 3.8);
        NoteBook notebook4 = new NoteBook("HP", 4, 1024, 3.8);
        NoteBook notebook5 = new NoteBook("Xiomi", 8, 256, 4.4);
        NoteBook notebook6 =  notebook1;
        Set<NoteBook> unicNoteBook = new HashSet<NoteBook>();
        unicNoteBook.add(notebook1);
        unicNoteBook.add(notebook2);
        unicNoteBook.add(notebook3);
        unicNoteBook.add(notebook4);
        unicNoteBook.add(notebook5);
        unicNoteBook.add(notebook6);
        System.out.printf("Первый ноутбук идентичен шестому: %b \n", notebook1.equals(notebook6));
        System.out.printf("Всего уникалных ноутбуков: %d \n", unicNoteBook.size());
        //System.out.println(unicNoteBook);
        Map<Integer, String> mapCrit = new HashMap<>();
        
        mapCrit.put(1, "объем оперативной памяти");
        mapCrit.put(2, "объем накопителя");
        mapCrit.put(3, "частота процессора");
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Введите желаемые характеристики: 1. объем оперативной памяти: ");
        int ramUser = sc.nextInt();
        System.out.println("2. объем накопителя: ");
        int storUser = sc.nextInt();
        System.out.println("3. частота процессора");
        double cpuUser = sc.nextDouble();
        for(NoteBook note: unicNoteBook) {
            if( (note.getOzu() >= ramUser) && (note.getHd() >= storUser)  && note.getCpu() >= cpuUser) {
                System.out.println(note.toString());
            }
        } 
        sc.close();
     }
}
    

