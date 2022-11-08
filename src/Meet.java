public class Meet {
    String name;
    private String town;
    private int yearOfBirth;
    String jobTitle;



    Meet(String name, String town, int yearOfBirth, String jobTitle){
        if (name == null || name.isBlank()){
        this.name = "Информация не указана";
        }else {
            this.name = name;
        }
        if (town == null || town.isBlank()) {
            this.town = town;
        }else {
            this.town = town;
        }
        if (yearOfBirth < 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }
        if (jobTitle == null || jobTitle.isBlank()) {
            this.jobTitle = "Информация не указана";
        } else {
            this.jobTitle = jobTitle;
        }

        }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
}




