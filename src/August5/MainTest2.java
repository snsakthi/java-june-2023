package August5;

class ElementaryStudent{
    private String name;
    private int id;
// we are not given any constructor, so it default consider name: null and id is 0//
    public void showElementaryStudentDetails(){
        System.out.println("ElementaryStudent name:"+name+" ElementaryStudent id :" +id);
    }
}

public class MainTest2 {
    public static void main(String[] args) {
        ElementaryStudent elementarystudent =new ElementaryStudent();
        elementarystudent.showElementaryStudentDetails();
    }
}
