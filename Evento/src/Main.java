import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Main {
    static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        List<Evento> registerEvent = new ArrayList<>();

        for(int i=1;i<=2;i++){
            System.out.println("Evento "+i);
            System.out.println("Evento Id: ");

            int eventId=entrada.nextInt();
            entrada.nextLine();

            System.out.println("Qual o nome do evento?");
            String eventName=entrada.nextLine();

            System.out.println("Onde será o evento?");
            String eventPlace=entrada.nextLine();

            System.out.println("Qual o preço do evento?");
            double ticketPrice=entrada.nextDouble();

            System.out.println("Quantas horas durará o evento?");
            int time=entrada.nextInt();
            entrada.nextLine();

            System.out.println("Qual a quantidade de ingressos disponíveis?");
            int numTickets=entrada.nextInt();
            entrada.nextLine();

            Evento eventos = new Evento(eventId, eventName, eventPlace, ticketPrice, numTickets, time);
            registerEvent.add(eventos);
        }

        System.out.println("\nLista de Eventos:");
        for (Evento f:registerEvent){
            f.show();
            System.out.println();
        }

        entrada.close();
    }
}
