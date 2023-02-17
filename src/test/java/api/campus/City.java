package api.campus;

public class City {
    private String countryName;
    private String countryCode;
    private String countryId;
    private String cityName;
    private String cityId;
    private String country;

    public String getCountryName(String randomCountryName) {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryCode(String randomCountryCode) {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryId(String countryId) {
        return this.countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public String getCityName(String randomCityName) {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityId(String cityId) {
        return this.cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "City{" +
                "countryName='" + countryName + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", countryId='" + countryId + '\'' +
                ", cityName='" + cityName + '\'' +
                ", cityId='" + cityId + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
