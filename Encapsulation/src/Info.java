import java.util.*;
public class Info {
    private String Brand;

    public String getBrand(){
        return Brand;
    }

    public void setBrand(){
        Scanner input = new Scanner(System.in);
        this.Brand=input.next();
    }
    private String Model;

    public String getModel(){
        return Model;
    }
    public void setModel(){
        Scanner input = new Scanner(System.in);
        this.Model=input.next();
    }
    private int Year;

    public int getYear(){
        return Year;
    }

    public void setYear(){
        Scanner input = new Scanner(System.in);
        this.Year=input.nextInt();
    }

    private int Displacement;

    public int getDisplacement(){
        return Displacement;
    }

    public void setDisplacement(){
        Scanner input = new Scanner(System.in);
        this.Displacement=input.nextInt();
    }

}
