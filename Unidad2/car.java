public class car {
    String brandM;
    int year;
    public car(String brandM, int year){
        this.brandM = brandM;
        this.year = year;

    } 

    public void Showinfo(){
        System.out.println("la marca de carro es " + brandM + " y el año del carro es :" + year);
    }
}
