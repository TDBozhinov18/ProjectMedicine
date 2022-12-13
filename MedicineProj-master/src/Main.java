import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
        Medicine med1 = new Medicine("Medicaments S++", 4.99, 69, LocalDate.of(2023, 3, 28));
        Medicine med2 = new Medicine("Medicaments L++", 9.99, 42, LocalDate.of(2023, 7, 14));
        Medicine med3 = new Medicine("Medicaments XXL++", 15.99, 5, LocalDate.of(2022, 12, 8));
        List<Medicine> meds = Arrays.asList(med1, med2, med3);

        System.out.println("Zad 1:");
        Medicine.showMedicineThatCostsMoreThan5(meds);
        System.out.println("Zad 2:");
        Medicine.showMedicineWithLessThan10InStock(meds);
        System.out.println("Zad 3:");
        Medicine.showExpiredDateMedicine(meds, LocalDate.of(2025, 6, 13));
    }
}
