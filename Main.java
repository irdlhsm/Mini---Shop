public class Main{

    public static void main(String[] args){

        Produkti Pepsi = new Produkti("Pepsi", 1.20, 5);
        Produkti CocaCola = new Produkti("CocaCola", 1.30, 4);
        Produkti Fanta = new Produkti("Fanta", 1.50, 3);

        System.out.println(Pepsi);
        System.out.println(CocaCola);
        System.out.println(Fanta);

        Pepsi.setSasia(10);
        System.out.println(Pepsi);

        Fanta.setCmimi(1.6);
        System.out.println(Fanta);

        System.out.println(Pepsi.eshteNeStok());
        System.out.println(Fanta.eshteNeStok());

        Pepsi.shite(3);
        System.out.println(Pepsi);

        Pepsi.shite(20);
        System.out.println(Pepsi);

        Pepsi.shtoStok(5);
        System.out.println(Pepsi);

        Pepsi.shtoStok(-5);
        System.out.println(Pepsi);

        Pepsi.setSasia(-10);
        System.out.println(Pepsi);


        // Array i produkteve
        Produkti[] produktet = new Produkti[3];

        produktet[0] = Pepsi;
        produktet[1] = CocaCola;
        produktet[2] = Fanta;


        // Shfaqja e produkteve
        for(int i = 0; i < produktet.length; i++){
            System.out.println(produktet[i]);
        }


        // Vlera totale e produkteve
        double totali = 0;

        for(int i = 0; i < produktet.length; i++){
            totali = totali + produktet[i].getVleraTotale();
        }

        System.out.println("Vlera totale e produkteve: " + totali + "€");


        // Kerkimi i produktit
        String kerko = "Pepsi";

        for(int i = 0; i < produktet.length; i++){
            if(produktet[i].getEmri().equals(kerko)){
                System.out.println(produktet[i]);
            }
        }


        // Kerkimi me metode
        Produkti p = kerkoProduktin(produktet, "Pepsi");

        System.out.println(p);
    }


    public static Produkti kerkoProduktin(Produkti[] produktet, String emri){

        for(int i = 0; i < produktet.length; i++){

            if(produktet[i].getEmri().equals(emri)){
                return produktet[i];
            }
        }

        return null;
    }
}