package lib;

public class main {
    public static void main(String[] args ) {
        Employee karywan1 = new Employee("id01", "dewa", "arjuna", "01", "jakarta", 2022, 8, 0, false, true);
        karywan1.setMonthlySalary(3);
        karywan1.setAnnualDeductible(500000);
        karywan1.setAdditionalIncome(100000);
        karywan1.addChild("daffa", "1");
        karywan1.setSpouse("madoka", "Hu tao");
        System.out.println("hhhhh "+karywan1.getAnnualIncomeTax());
    }
    
}
