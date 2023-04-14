package lib;

public class TaxFunction {

	private static final double TAX_RATE = 0.05;
    private static final int MAX_CHILDREN_COUNT = 3;
	
	/**
	 * Fungsi untuk menghitung jumlah pajak penghasilan pegawai yang harus dibayarkan setahun.
	 * 
	 * Pajak dihitung sebagai 5% dari penghasilan bersih tahunan (gaji dan pemasukan bulanan lainnya dikalikan jumlah bulan bekerja dikurangi pemotongan) dikurangi penghasilan tidak kena pajak.
	 * 
	 * Jika pegawai belum menikah dan belum punya anak maka penghasilan tidak kena pajaknya adalah Rp 54.000.000.
	 * Jika pegawai sudah menikah maka penghasilan tidak kena pajaknya ditambah sebesar Rp 4.500.000.
	 * Jika pegawai sudah memiliki anak maka penghasilan tidak kena pajaknya ditambah sebesar Rp 4.500.000 per anak sampai anak ketiga.
	 * 
	 */
	
	
	 public static int calculateTax(int monthlySalary, int otherMonthlyIncome, int numberOfMonthWorking, int deductible, boolean isMarried, int numberOfChildren) {
        if (numberOfMonthWorking > 12) {
            numberOfMonthWorking = 12;
        }
        numberOfChildren = Math.min(numberOfChildren, MAX_CHILDREN_COUNT);

        int taxableIncome = calculateTaxableIncome(monthlySalary, otherMonthlyIncome, numberOfMonthWorking, deductible, isMarried, numberOfChildren);

        int tax = (int) Math.round(TAX_RATE * taxableIncome);

        return Math.max(0, tax);
    }

    private static int calculateTaxableIncome(int monthlySalary, int otherMonthlyIncome, int numberOfMonthWorking, int deductible, boolean isMarried, int numberOfChildren) {
        int totalIncome = (monthlySalary + otherMonthlyIncome) * numberOfMonthWorking;
        int taxExemption = calculateTaxExemption(isMarried, numberOfChildren);

        return totalIncome - deductible - taxExemption;
    }

    private static int calculateTaxExemption(boolean isMarried, int numberOfChildren) {
        int taxExemption = 54000000;

        if (isMarried) {
            taxExemption += 4500000;
        }

        taxExemption += Math.min(numberOfChildren, MAX_CHILDREN_COUNT) * 1500000;

        return taxExemption;
    }

}