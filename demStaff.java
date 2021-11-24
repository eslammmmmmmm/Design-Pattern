
package dessign.pattren;
import java.util.Scanner;

public class demStaff {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter The Staff name: ");
        String name_jop=input.next();
        
      staff_Factory StaffFact=new staff_Factory();
      Staff staf=StaffFact.getStaff(name_jop);
       System.out.println("Enter The Count Years Of Work: ");
        int countYears=input.nextInt();
      staf.getSalary();
      staf.getYearsOfWork(countYears);
      staf.showStaff();
        
    }
    
}
