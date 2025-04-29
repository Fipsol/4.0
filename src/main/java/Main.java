/*
Kod bazowy programu Commit4_0: 
• Program dodaje do prostej bazy danych (pliku db.txt) dane odnośnie Studentów.
• Studenci dodawani są w klasie Main.
• Wszyscy studenci są wypisywani na końcu klasy Main.
• Klasa Service obsługuje odczyt i zapis do pliku bazy danych.
• Klasa Student reprezentuje pojedynczego studenta (Imię, Wiek).
*/
import java.io.IOException;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    try {
      Service s = new Service();
      int opcja;
      Scanner sc = new Scanner(System.in);
      boolean isTrue = true;
      String name, surName;
      int age;
      while(isTrue)
        {
          System.out.println("1. Dodaj studenta");
          System.out.println("2. Wypisz studentow");
          System.out.println("3. Wyjdz");
          opcja = sc.nextInt();
          switch (opcja) {
            case 1:
                System.out.println("Podaj imie: ");
                name = sc.next();
                System.out.println("Podaj nazwisko: ");
                surName = sc.next();
                System.out.println("Podaj wiek: ");
                age = sc.nextInt();
                Student student = new Student(name, surName, age);
                s.addStudent(student);
                break;
            case 2:
                students = s.getStudents();
                for(Student current : students) {
                  System.out.println(current.ToString());
                }
                break;
            case 3:
                isTrue = false;
                break;
            }
        }
      
    } 
    catch (IOException e) {
    }
  }
}