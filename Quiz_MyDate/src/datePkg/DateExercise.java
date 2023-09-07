package datePkg;
public class DateExercise {
    public DateExercise(){
    }

    public static void main(String[] args) {
        //Instancia de fecha
        MyDate fecha = new MyDate(2020, 02,20);
        System.out.println(fecha);

        //Error instancia
        MyDate fechaDos = new MyDate(2000, 02, 29);
        System.out.println(fechaDos);

        //Método setDate
        fecha.setDate(2020,02,50);
        System.out.println(fecha);

        fechaDos.setDate(2020, 50,12);
        System.out.println(fechaDos);
    }
}
