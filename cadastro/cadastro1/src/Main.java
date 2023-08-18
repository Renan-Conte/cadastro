import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


       List< person> studants = new ArrayList<person>();
       boolean exit = true;

       while (true){

           person studant = new person();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome completo do studant");
         studant.name =scanner.nextLine();
         studants.add(studant);

         System.out.println("Obrigado por digitar o nome completo do " + studant.name);


           System.out.println("Deseja cadastrar mais alguém? S/SIM e N/NÃo ");
           String option = scanner.next();
           if (option.equals("N")){
               exit = false;
           }


       }



    }
}