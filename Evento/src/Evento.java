public class Evento {

    private int eventId;
    private String eventName;
    private String eventPlace;
    private double ticketPrice;
    private int numTickets;
    private int time;

    public Evento(int eventId, String eventName, String eventPlace, double ticketPrice, int numTickets, int time){
        this.eventId=eventId;
        this.eventName=eventName;
        this.eventPlace=eventPlace;
        this.ticketPrice=ticketPrice;
        this.numTickets=numTickets;
        this.time=time;
    }

    public void ticketsNumber(){
        if (numTickets<=10){
            System.out.println("Últimas vagas.");
        }
        else if(numTickets<30){
            System.out.println("Ainda há bastante vagas.");
        }
        else if(numTickets>30){
            System.out.println("Diversas vagas disponíveis.");
        }
    }

    public boolean verifyFreeTickets(){
        if (numTickets>0){
            return true;
        }
        else{
            return false;
        }
    }

    public void ticketDiscount(){
        if (ticketPrice>=300.00){
            double num1=ticketPrice/10;
            double result = ticketPrice-num1;
            System.out.println("Valor do ingresso: R$ "+ticketPrice);
            System.out.println("Você pode receber 10% de desconto nesta compra!\n-");
            System.out.println("Valor final do ingresso: R$ "+result);
        }
        else {
            System.out.println("Valor do ingresso: R$ "+ticketPrice);
        }
    }

    public void show(){
        System.out.println("Id do evento: "+eventId);
        System.out.println("Evento: "+eventName);
        System.out.println("Local do evento: "+eventPlace);
        System.out.println("O evento durará: "+time+" horas.");
        ticketDiscount();
        if (verifyFreeTickets()){
            ticketsNumber();
        }
        else {
            System.out.println("Não há mais vagas para este evento.");
        }
    }
}
