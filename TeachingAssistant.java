
package dessign.pattren;


public class TeachingAssistant implements Staff{
public double salaryASSi;
public int CountYears;
    @Override
    public void getSalary() {
    salaryASSi=5000.0;
    }

    @Override
    public int getYearsOfWork(int Count_Years) {
        this.CountYears=Count_Years;
        return CountYears;
    }


    @Override
    public void showStaff() {
          System.out.println("The Jop is Doctor"+"  Salary is: "+this.salaryASSi
                   +" Count Years Of Work is: "+this.getYearsOfWork(this.CountYears));
    }
    
    
}
