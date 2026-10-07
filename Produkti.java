public class Produkti{
    private String emri;
    private double cmimi;
    private int sasia;

    public Produkti(String emri, double cmimi, int sasia){
        this.emri = emri;
        this.cmimi = cmimi;
        this.sasia = sasia;
    }

    public String getEmri(){
        return emri;
    }

    public double getCmimi(){
        return cmimi;
    }

    public int getSasia(){
        return sasia;
    }

    public void setEmri(String emri){
        this.emri = emri;
    }

    public void setCmimi(double cmimi){
        this.cmimi = cmimi;
    }

    public void setSasia(int sasia){
        if(sasia >= 0){
            this.sasia = sasia;
        }
        else{
            System.out.println("Sasia nuk mund te jete negative!");
        }
    }

    public double getVleraTotale(){
        return cmimi * sasia;
    }

    @Override
    public String toString(){
        return "Emri " + emri +
               ", Cmimi " + cmimi + "€, Sasia " + sasia +
               ", Vlera Totale " + getVleraTotale();
    }

    public boolean eshteNeStok(){
        if(sasia > 0){
            return true;
        }
        else{
            return false;
        }
    }

    public void shite(int sasi){
        if(sasi <= 0){
            System.out.println("Sasia duhet te jete pozitive!");
        }
        else if(sasi > this.sasia){
            System.out.println("Nuk ka mjaftueshem stok!");
        }
        else{
            this.sasia = this.sasia - sasi;
        }
    }

    public void shtoStok(int sasi){
        if(sasi > 0){
            this.sasia = this.sasia + sasi;
        }
        else{
            System.out.println("Sasia duhet te jete pozitive!");
        }
    }
}