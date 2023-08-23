package invoiceExercisePkg;

public class InvoiceItemExercise {
    public InvoiceItemExercise(){
    }
    public static void main(String[] args) {
        InvoiceItem invoiceOne = new InvoiceItem();

        invoiceOne.setDesc("7%");
        invoiceOne.setQty(10);
        invoiceOne.setUnitPrice(100);

        System.out.println("El precio total es: " + invoiceOne.getTotal());
        System.out.println("El descuento de mañana es: " + invoiceOne.getDesc());

        System.out.println(invoiceOne);

    }
}