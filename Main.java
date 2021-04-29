public class Main {
    public static void main(String[] args){
        Caneta caneta1 = new Caneta("BIC Crystal", "Vermelha", 0.5f, 80, true);
        Caneta caneta2 = new Caneta("NIC", "Azul", 0.7f, 20, false);
        Caneta caneta3 = new Caneta("PIC", "Preta", 1.0f, 50, true);

        caneta1.destampar();
        caneta1.status();
        caneta1.rabiscar();
        caneta1.setTinta("Vermelha", 100);
        caneta1.tampar();
        caneta1.rabiscar();

        caneta2.destampar();
        caneta2.status();
        caneta2.rabiscar();
        caneta2.setTinta("Azul", 80);
        caneta2.tampar();
        caneta2.rabiscar();

        caneta3.destampar();
        caneta3.status();
        caneta3.rabiscar();
        caneta3.setTinta("Preta", 75);
        caneta3.tampar();
        caneta3.rabiscar();
    }
}
