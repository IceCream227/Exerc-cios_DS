public class Main {
    static void main(String[] args) {
       Matricula p1 = new Matricula(123456, "Alberto", "Engenheiro", 3500);
       Matricula p2 = new Matricula(0,"Luana", "Designer", 1600);
       Matricula p3 = new Matricula(123455, "Augusto", "Médico", 5000);

       p1.Show();
       System.out.println();
       p2.Show();
       System.out.println();
       p3.Show();
    }
}
