import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    Student student1 = new Student();
    Student student2 = new Student();
    double gpaSum = 0.0;

    student1.setName("Arnold Spielberg");
    student1.setGPA(4.0);
    student1.setMajor("Electrical Engineering");
    
    student2.setName("Alyssa Adams");
    student2.setGPA(3.6);
    student2.setMajor("Information Systems");

    student1.print();
    student2.print();

    ArrayList<Double> gpas = new ArrayList<Double>();
    gpas.add(student1.getGPA());
    gpas.add(student2.getGPA());

    for (double i : gpas) {
      gpaSum+= i;
    }
    gpaSum = gpaSum / gpas.size();
    System.out.println("The Average GPA is "+gpaSum);
  }
}