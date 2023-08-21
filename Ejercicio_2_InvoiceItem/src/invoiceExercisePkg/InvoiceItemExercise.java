package invoiceExercisePkg;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class InvoiceItemExercise {
    public InvoiceItemExercise(){
    }
    public static void main(String[] args) {
        InvoiceItem invoiceOne = new InvoiceItem();

        invoiceOne.setDesc("7");
        invoiceOne.setQty(10);
        invoiceOne.setUnitPrice(100);

        System.out.println("El precio total es: " + invoiceOne.getTotal());

        System.out.println(invoiceOne.toString());

    }
}