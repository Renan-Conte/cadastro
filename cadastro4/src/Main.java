import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.



public class Main {
    public  static  Scanner scanner = new Scanner(System.in);

  public  static   List<Person> studants = new ArrayList<>();
    public static void main(String[] args) {

        List<Person> studants = new ArrayList<>();
        boolean exit = true;

        while (exit){


           Scanner scanner = new Scanner(System.in);
            System.out.println("Selecione a opção ");
            System.out.println("1 - cadastrar");
            System.out.println("2 - Buscar ");
            System.out.println("3 - remover");
            System.out.println("4 - editar");
            System.out.println("5 - sair");


            int option = scanner.nextInt();

            switch ( option){
                case 1:
                    addStudant(studants);
                    break;
                case  2:
                    System.out.println("Qual o nome que deseja buscar?");
                    String nameToFind = scanner.nextLine();
                    findStudent(studants, nameToFind);
                    break;
                case 3:
                    removeStudant();
                    break;
                case  4:
                    editStudant();
                    break;

                case  5:
                    exit = false;

    }

    }

        }
        private static void removeStudant(){
            System.out.println("Qual o nome que deseja remover?");
            String  name = scanner.next();
           Integer position = findStudent(studants, name);

            if (position != null){
           studants.remove(position.intValue());

            }

        }
        private  static  void editStudant(){
            System.out.printf("Qual nome deseja editar?");
           String name = scanner.nextLine();
           Integer position = findStudent(studants, name);
           if (position != null){
              Person p1 = studants.get(position.intValue());
               System.out.println("Qual é o novo nome? ");
               name = scanner.next();
               p1.name = name;
           }

        }


        private  static  void  addStudant(List<Person> studants){
            Person studant = new Person();

            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite o nome completo do studant");
            studant.name = scanner.nextLine();
            studants.add(studant);

            System.out.println("Obrigado por digitar o nome completo do studant" + studant);


        }
         private  static  int  findStudent(List<Person> students, String studentsName) {
          int position = 0;
          for (int count = 0; count < students.size(); count++){
              Person student = students.get(count);
              if (student.equals(studentsName)){
                  position = count;
                  System.out.println("Encontrei o " + studentsName);
              }


          }
          return  position;
         }



}

