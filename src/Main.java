public class Main {

    public static void main(String[] args) {
	// write your code here

         Student student=new Student();
         student.setUserName("Emirhan");
         student.setId(1);
         student.setClassRoom("C#");
         student.setLevel("Junior");
         Instructor instructor=new Instructor();
         instructor.setId(2);
         instructor.setUserName("Engin");
         instructor.setSpeciality("Java,Python,C#,C++");



        InstructorManager instructorManager=new InstructorManager();
        instructorManager.addUser(instructor.getUserName());
        StudentManager studentManager=new StudentManager();
        studentManager.addUser(student.getUserName());

        User[] users={student,instructor};
        for(User user:users){
            System.out.println("Yeni Kullanıcı Eklendi"+" "+user.getUserName());
        }





    }
}
