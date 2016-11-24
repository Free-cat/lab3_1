public class Student implements Student_Interface{
    public int uspev;
    public String FIO;
    public int mark;

    Student(int uspevs, String FIOS, int marks){
        uspev=uspevs;
        FIO=FIOS;
        mark=marks;
    }

    @Override
    public String GetStudent() {
        return FIO;
    }

    @Override
    public int GetUspev() {
        return mark;
    }
}
