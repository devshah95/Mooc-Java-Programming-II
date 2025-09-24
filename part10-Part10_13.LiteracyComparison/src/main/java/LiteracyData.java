public class LiteracyData {
    private String country;
    private int year;
    private String gender;
    private double literacyRate;

    public LiteracyData(String country, int year, String gender, double literacyRate) {
        this.country = country;
        this.year = year;
        this.gender = gender;
        this.literacyRate = literacyRate;
    }

    public String getCountry() {
        return this.country;
    }

    public int getYear() {
        return this.year;
    }

    public String getGender() {
        return this.gender;
    }

    public double getLiteracyRate() {
        return this.literacyRate;
    }

    @Override
    public String toString() {
        return this.country + "( " + this.year + "), " + this.gender + ", " + this.literacyRate;
    }
}
