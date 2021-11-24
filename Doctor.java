
package dessign.pattren;


public class Doctor implements Staff{
double salaryDoc;
int CountYears;
    @Override
    public void getSalary() {
        this.salaryDoc=7000.0;
    }

    @Override
    public int getYearsOfWork(int Count_Years) {
        this.CountYears=Count_Years;
        return CountYears;
    }


    @Override
    public void showStaff() {
          System.out.println("The Jop is Doctor"+"  Salary is: "+this.salaryDoc
                   +" Count Years Of Work is: "+this.getYearsOfWork(this.CountYears));
    }
    
}
