package lesson_38.code.practice;

public class NotebookDemo {
    public static void main(String[] args) {


        NoteBook notebook1 = new NoteBook("Vivobook","ASUS");

        NoteBook.Monitor monitor1 = notebook1.new Monitor( 15.6);
        NoteBook.Hdd hdd1 =  notebook1.new Hdd(500);

        monitor1.addBrightness();
        monitor1.decBrightness();

        hdd1.hddWrite();
        hdd1.hddRead();


        System.out.println(notebook1 + " " + monitor1.getDiagonal() + " Inch " + hdd1.getHddCapacity() + " Gb ");






    }

}
