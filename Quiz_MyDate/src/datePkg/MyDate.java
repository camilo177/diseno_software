package datePkg;

public class MyDate {
    private int yearb;
    private int mes;
    private int dia;

    //Constructor
    public MyDate(int yearb, int mes, int dia){
        this.yearb = yearb;
        //Restricción meses
        if (mes < 1 || mes > 12){
            System.out.println("Mes Inválido");
        }
        else{
            this.mes = mes;
        }

        //Restricción de días
        if ((this.mes == 1 || this.mes == 3 || this.mes == 5 || this.mes == 7 || this.mes == 8 || this.mes == 10 || this.mes == 12) && (dia > 31 || dia < 1)) {
            System.out.println("Error, Ingrese un día Válido");
        }

        else if ((this.mes == 2) && (dia > 28 || dia < 1)){
            System.out.println("Error, Ingrese un día Válido");
        }
        else if ((this.mes == 4  || this.mes == 6 || this.mes == 9 || this.mes == 11)&&(dia > 30 || dia < 1)) {
            System.out.println("Error, Ingrese un día Válido");
        }
        else{
        this.dia = dia;
        }
    }

    //Métodos
    public int getYearb() {
        return yearb;
    }

    public void setYearb(int yearb) {
        this.yearb = yearb;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "mes=" + mes +
                ", dia=" + dia +
                ", yearb=" + yearb +
                '}';
    }
    public void setDate(int yearb, int mes, int dia){
        this.yearb = yearb;
        //Restricción meses
        if (mes < 1 || mes > 12){
            System.out.println("Mes Inválido");
        }
        else{
            this.mes = mes;
        }

        //Restricción de días
        if ((this.mes == 1 || this.mes == 3 || this.mes == 5 || this.mes == 7 || this.mes == 8 || this.mes == 10 || this.mes == 12) && (dia > 31 || dia < 1)) {
            System.out.println("Error, Ingrese un día Válido");
        }

        else if ((this.mes == 2) && (dia > 28 || dia < 1)){
            System.out.println("Error, Ingrese un día Válido");
        }
        else if ((this.mes == 4  || this.mes == 6 || this.mes == 9 || this.mes == 11)&&(dia > 30 || dia < 1)) {
            System.out.println("Error, Ingrese un día Válido");
        }
        else{
            this.dia = dia;
        }
    }
}

