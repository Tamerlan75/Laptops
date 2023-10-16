public class NoteBook {
private String name;
private int ozu;
private int hd;
private double cpu;

public NoteBook(String name, int ozu, int hd, double cpu){
    this.name = name;
    this.ozu = ozu;
    this.hd = hd;
    this.cpu = cpu;
}
@Override
public String toString() {
    return String.format("Название: %s \n объем оперативной памяти: %d Гб \n объем накопителя %d Гб \n частота прцессора %s \n",
                this.name, this.ozu, this.hd, this.cpu);
}
@Override
public boolean equals(Object obj) {
    if (obj instanceof NoteBook) {
        return this.name.equals(((NoteBook) obj).name) && this.ozu == ((NoteBook) obj).ozu
                            && this.hd == ((NoteBook) obj).hd && this.cpu==((NoteBook) obj).cpu;
                            
   }
    return false;
}
public String getName(){
     return this.name;
}     
public int getOzu(){
    return this.ozu;
}
public int getHd(){
    return this.hd;
}
public double getCpu(){
    return this.cpu;
}
}


