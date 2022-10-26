public class Meet {
    String name;
    String town;
    int yearOfBirth;
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




}