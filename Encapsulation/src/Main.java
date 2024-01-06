public class Main {
    public static void main(String[] args) {
        Info Scan = new Info();
        System.out.println("Input information ");
        System.out.print("Car brand: ");
        Scan.setBrand();
        System.out.print("Car model: ");
        Scan.setModel();
        System.out.print("Year of production: ");
        Scan.setYear();
        System.out.print("Engine displacement: ");
        Scan.setDisplacement();
        System.out.print("Brand - "+Scan.getBrand()+" "+"\nModel - "+Scan.getModel()+" "+
                "\nYear - "+Scan.getYear()+" "+"\nEngine Displacement - "+Scan.getDisplacement());
    }
}