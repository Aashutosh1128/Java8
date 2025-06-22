public class TotalAndAvg extends StudentMarkCalc
{
    int totalM;
    int avg;

     TotalAndAvg(int rollNumber, String stuName, int mathsM, int phyM, int chemM) {
        super(rollNumber, stuName, mathsM, phyM, chemM);
    }

    public void total(){
        totalM=mathsM+phyM+chemM;
        System.out.println("Total marks of Student = "+totalM);
    }

    public void average(){
        avg=totalM/3;
        System.out.println("Average marks of Student = "+avg);
    }

    public void dispalyRes(){
        System.out.println("Student Name = "+ this.stuName);
        System.out.println("Student Roll number = "+this.rollNumber);
        total();
        average();
    }



}
