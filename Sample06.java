class Employee{
  String name;
  int idNum;
  int salary;
  boolean sex;
}

public class Sample06 {
  public static void main(String[] args) {
    Employee myjik = new Employee();
    myjik.name = "ȫ�浿";
    myjik.idNum = 17001;
    myjik.sex = true;
    System.out.printf("%s\n",myjik.name);
    System.out.printf("%d\n",myjik.idNum);
    System.out.printf("%d\n",myjik.salary);
    System.out.printf("%d\n",myjik.sex);
  }
}