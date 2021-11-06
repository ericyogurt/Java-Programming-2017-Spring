
package studentsys;
public class StudentSys{
    public static void main(String[] args)
    {
       Student BaoYibei = new Student("11244001","BaoYibei");
       Student CaoMengke = new Student("11244002","CaoMengke");
       Student ChenJianyu = new Student("11244003","ChenJianyu");

       BaoYibei.setCourseGrade(new int[]{80,-1});
       CaoMengke.setCourseGrade(new int[]{-1,60});
       ChenJianyu.setCourseGrade(new int[]{75,70});

       CourseStudents math = new CourseStudents("85L2001","math",4,0);
       CourseStudents physics = new CourseStudents("85L3001","physics",3,0);

       math.addStudent(BaoYibei);
       math.addStudent(ChenJianyu);
       physics.addStudent(CaoMengke);
       physics.addStudent(ChenJianyu);
       //输出学生信息
        System.out.println("Undergraduate Students List :");
        System.out.println(BaoYibei.getId()+" " +BaoYibei.getName());
        System.out.println(CaoMengke.getId()+" " +CaoMengke.getName());
        System.out.println(ChenJianyu.getId()+" " +ChenJianyu.getName());
        //输出Math成绩
        System.out.println("Math Grade:");
        for(int i = 0;i<math.numberOfStudent;i++)
        {
            System.out.println(math.getStudents()[i].getId()+" "+math.getStudents()[i].getName()+" "+ math.getStudents()[i].getCourseGrade()[0]);
        }
        //输出Physics 成绩
        System.out.println("Physics Grade:");
        for(int i = 0;i<physics.numberOfStudent;i++)
        {
            System.out.println(physics.getStudents()[i].getId()+" "+physics.getStudents()[i].getName()+" "+physics.getStudents()[i].getCourseGrade()[1]);
        }
        //输出math的平均分
        System.out.println("Math Average Grade:"+math.getAverage());
        //s输出physics的平均分
        System.out.println("Physics Average Grade:"+physics.getAverage());

    }
 static  class  Student
 {
    private String id;
    private  String name;
    private int[] courseGrade;
    public Student()
    {

    }
    public Student(String id,String name)
    {
        this.id = id;
        this.name = name;
        this.courseGrade = new  int[50];
    }
    public  void setId(String id)
    {
        this.id = id;
    }
    public String getId()
    {
        return this.id;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return this.name;
    }
    public void setCourseGrade(int[] list)
    {
        this.courseGrade = list;
    }
    public int[] getCourseGrade()
    {
        return this.courseGrade;
    }
 }
   static  class Undergraduate extends Student
  {
     private String title;
     private double paperGrade;
     public Undergraduate()
     {

     }
     public Undergraduate(String id ,String name,String title,double paperGrade)
     {
       super(id,name);
       this.title = title;
       this.paperGrade = paperGrade;
     }
     public void setTitle(String title)
     {
         this.title = title;
     }
     public String getTitle()
     {
          return this.title;
     }
     public void setPaperGrade(double papergrade)
     {
         this.paperGrade = papergrade;
     }
     public double  getPaperGrade()
     {
         return this.paperGrade;
     }
  }
  static  class Course
  {
      private String id;
      private String name;
      private int grade;
      public  Course()
      {
      }
      public Course(String id ,String name,int grade)
      {
          this.id = id;
          this.name = name;
          this.grade = grade;
      }
      public String getId() {
          return id;
      }

      public String getName() {
          return name;
      }

      public int getGrade() {
          return grade;
      }

      public void setId(String id) {
          this.id = id;
      }

      public void setName(String name) {
          this.name = name;
      }

      public void setGrade(int grade) {
          this.grade = grade;
      }
  }
  static  class CourseStudents extends  Course
  {
       private Student[] students;
       private int numberOfStudent;
       public  CourseStudents()
       {

       }
       public  CourseStudents(String id,String name,int grade,int numberOfStudent)
      {
          super(id,name,grade);
          this.students = new Student[90];
          this.numberOfStudent = numberOfStudent;
      }
      public Student[] getStudents() {
          return students;
      }

      public int getNumberOfStudent() {
          return numberOfStudent;
      }

      public void setStudents(Student[] students) {
          this.students = students;
      }

      public void setNumberOfStudent(int numberOfStudent) {
          this.numberOfStudent = numberOfStudent;
      }
      public  void addStudent(Student student)
      {
          this.students[this.numberOfStudent] = student;
          this.numberOfStudent++;
      }
      public void dropStudengt(Student student)
      {   int i = 0;
          for(;i<numberOfStudent;i++)
          {
              if((students[i].name).equals(student.name))
              {
                  break;
              }
          }
          for(int j = i;j<numberOfStudent-1;j++)
          {
              students[i] = students[i+1];
          }
          students[i+1] = null;
          numberOfStudent--;
      }
      public  int getAverage()
      {
          int sum = 0;
          String name = this.getName();
          if(name.equals("math"))
          {
              for(int i = 0;i<numberOfStudent;i++)
              {
                  sum += students[i].courseGrade[0];
              }
          }
          if(name.equals("physics"))
          {
              for(int i = 0;i<numberOfStudent;i++)
              {
                  sum += students[i].courseGrade[1];
              }
          }
         return sum/numberOfStudent;
      }
  }

}