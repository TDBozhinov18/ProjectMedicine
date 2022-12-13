import java.time.LocalDate;
import java.util.List;

public class Medicine {
    String name;
    double price;
    int inStock;
    LocalDate date;

    @Override
    public String toString() {
        return name + ": " + price + "BGN  In Stock: " + inStock + " Date Of Expiration: " + date + "\n";
    }

    public Medicine(String name, double price, int inStock, LocalDate date) {
        this.name = name;
        this.price = price;
        this.inStock = inStock;
        this.date = date;
    }

    public static void showMedicineThatCostsMoreThan5(List<Medicine> meds) {
        meds.stream().filter(med -> med.price >= 5.00).forEach(med -> System.out.print(med.toString()));
    }

    public static void showMedicineWithLessThan10InStock(List<Medicine> meds) {
        meds.stream().filter(med -> med.inStock <= 10).forEach(med -> System.out.print(med.toString()));
    }

    public static void showExpiredDateMedicine(List<Medicine> meds, LocalDate givenDate) {
        meds.stream().filter(med -> med.date.isBefore(givenDate)).forEach(med -> System.out.print(med.toString()));
    }
}