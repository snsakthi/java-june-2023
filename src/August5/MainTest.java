package August5;

class Students{
    private String name;
    private int id;

    //constructor
    Students(){
        name = "Pavithra";
        id = 101;
    }

    public void showStudentsDetails(){
        System.out.println("Students name :"+name+" Students id :"+id);

    }
}
public class MainTest {
    public static void main(String[] args) {
        Students student=new Students();
        student.showStudentsDetails();
    }
}
