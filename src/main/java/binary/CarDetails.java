package binary;

public class CarDetails {
    public String carmodel;
    public String manufacturingNumber;

    public int years;

    public CarDetails(int years, String carmodel, String manufaturingNumber){

        this.carmodel=carmodel;
        this.manufacturingNumber=manufaturingNumber;
        this.years=years;
    }
    public String getCarmodel() {
        return carmodel;
    }

    public void setCarmodel(String carmodel) {
        this.carmodel = carmodel;
    }

    public String getmanufacturingnumber() {
        return manufacturingNumber;
    }

    public void setmanufacturingnumber(String manufacturingnumber) {
        manufacturingNumber = manufacturingnumber;
    }


    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }



    @Override
    public String toString() {
        return "Car{" +
                "model='" + carmodel + '\'' +
                ", year=" + years +
                ", num='" + manufacturingNumber + '\'' +
                '}';
    }





}
