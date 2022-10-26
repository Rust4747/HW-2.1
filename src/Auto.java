public class Auto {
    String brand;
    String model;
    String engineModel;
    String color;
    int year;
    String country;


    @Override
    public String toString() {
        return " " +
                " " + brand + '\'' +
                " " + model + '\'' +
                " объем двигателя " + engineModel + '\'' +
                " цвет " + color + '\'' +
                " год производства " + year + '\'' +
                " страна производства" + country + '\'';
    }

    Auto(String brand, String model, String engineModel, String color, int year, String country) {
        if (brand == null || brand.isBlank()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isBlank()){
            this.model = "default";
        } else {
            this.model = model;
        }
        if (engineModel == null || engineModel.isBlank()) {
            this.engineModel = "1,5L";
        } else {
            this.engineModel = engineModel;
        }
        if (color == null || color.isBlank()) {
            this.color = "белый";
        } else {
            this.color = color;
        }
        if (year < 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        if (country == null || country.isBlank()) {
            this.country = "default";
        } else {
            this.country = country;
        }
    }

    void machine () {
        System.out.println(""+brand);
        System.out.println(""+model);
        System.out.println(""+engineModel);
        System.out.println(""+color);
        System.out.println(""+year);
        System.out.println(""+country);
    }




}
