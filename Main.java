import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) {


        LocalDate cdob=LocalDate.now();
        Employee em= new Employee();
        student std=new student();
        em.setbDay(6);
        em.setbMonth(12);
        em.setbYear(2000);
        int eBDay= em.getbDay();
        int eBMonth=em.getbMonth();
        int eBYear=em.getbYear();
        LocalDate edob= LocalDate.of(eBYear,eBMonth,eBDay);
        //STudent

        Period period = Period.between(edob, cdob);
        System.out.println("Empolyee Age= "+ period.getYears());
        std.setbDay(6);
        std.setbMonth(2);
        std.setbYear(2000);
        int sBDay= std.getbDay();
        int sBMonth=std.getbMonth();
        int sBYear=std.getbYear();
        LocalDate sdob= LocalDate.of(sBYear,sBMonth,sBDay);
        Period periods = Period.between(sdob, cdob);
        System.out.println("Student Age= "+ periods.getYears());


    }
}