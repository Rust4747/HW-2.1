package transport;

import java.time.LocalDate;

public class Auto {
    private String brand;
    private String model;
    private String engineModel;
    private String color;
    private int year;
    private String country;
    private String gear;
    private String body;
    private String autoNumber;
    private int seats;
    private boolean tyres;
    private Key key;
    private Insurance insurance;


    public Auto(String brand, String model, String engineModel, String color, int year, String country, String gear, String body,
                String autoNumber, int seats, boolean tyres, Key key, Insurance insurance) {
        this.key = key;
        if (brand == null || brand.isBlank()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isBlank()) {
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
        if (body == null) {
            this.body = "седан";
        } else {
            this.body = body;
        }
        if (seats == 0) {
            this.seats = 5;
        } else {
            this.seats = seats;
        }
        if (gear == null) {
            this.gear = "МКПП";
        } else {
            this.gear = gear;
        }
        if (autoNumber == null) {
            this.autoNumber = "x000xx000";
        } else {
            this.autoNumber = autoNumber;
        }
        this.tyres = true;

        if (key == null) {
            this.key = new Key();

        } else {
            this.key = key;
        }
        if (insurance == null) {
            this.insurance = new Insurance();

        } else {
            this.insurance = insurance;

        }


    }

    public Insurance getInsurance() {
        return insurance;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getEngineModel() {
        return engineModel;
    }

    public void setEngineModel(String engineModel) {
        if (engineModel == null || engineModel.isBlank()) {
            this.engineModel = "1,5L";
        } else {
            this.engineModel = engineModel;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isBlank()) {
            this.color = "белый";
        } else {
            this.color = color;
        }
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getGear() {
        return gear;
    }

    public void setGear(String gear) {
        if (gear == null) {
            this.gear = "МКПП";
        } else {
            this.gear = gear;
        }
    }

    public void setBrand(String brand) {
        if (brand == null || brand.isBlank()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
    }

    public String getBody() {
        return body;
    }

    public String getAutoNumber() {
        return autoNumber;
    }

    public void setAutoNumber(String autoNumber) {
        if (autoNumber == null) {
            this.autoNumber = "x000xx000";
        } else {
            this.autoNumber = autoNumber;
        }
    }

    public int getSeats() {
        return seats;
    }

    public boolean isTyres() {
        return tyres;
    }

    public void setTyres(boolean tyres) {
        this.tyres = tyres;
    }

    public void changeTyre() {
        tyres = !tyres;

    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public boolean correctNumber() {
        if (autoNumber.length() != 9) {
            return false;
        }
        char[] chars = autoNumber.toCharArray();
        if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) || !Character.isAlphabetic(chars[5])) {
            return false;
        }
        if (!Character.isDigit(chars[1]) || !Character.isDigit(chars[2]) || !Character.isDigit(chars[3])
                || !Character.isDigit(chars[6]) || !Character.isDigit(chars[7]) || !Character.isDigit(chars[8])) {
            return false;
        }
        return false;
    }

    class Key {

        private final boolean runEngine;
        private final boolean keyAccess;


        public Key(boolean runEngine, boolean keyAccess) {
            this.runEngine = runEngine;
            this.keyAccess = keyAccess;
        }

        public boolean isRunEngine() {
            return runEngine;
        }

        public boolean isKeyAccess() {
            return keyAccess;
        }

        public Key() {
            this(false, false);

        }


    }

    public class Insurance {
        private LocalDate expireDate;
        private double cost;
        private String number;




        public Insurance(LocalDate expireDate, double cost, String number) {
            if (expireDate == null) {
                expireDate = LocalDate.now().plusDays(364);
            } else {
                this.expireDate = expireDate;
            }
            this.cost = cost;
            if (number==null){
                this.number = "123456789";
            } else {
                this.number=number;
            }


        }
        public Insurance() {
            this(null,10000,null);
        }







        public LocalDate getExpireDate() {
            return expireDate;
        }

        public double getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }
        public void checkED() {
            if (expireDate.isBefore(LocalDate.now()) || expireDate.isEqual(LocalDate.now())) {
                System.out.println("Продлить страховку");
            }
        }
        public void checkNumber() {
            if (number.length() !=9) {
                System.out.println("некорректный номер страховки");

            }

        }
    }
}


