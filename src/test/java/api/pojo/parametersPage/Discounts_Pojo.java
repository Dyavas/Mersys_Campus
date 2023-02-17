package api.pojo.parametersPage;

public class Discounts_Pojo {

    /*
    {
  "id": null,
  "description": "{{$randomDepartment}}",
  "code": "{{$randomCountryCode}}",
  "active": true,
  "translateDescription": [],
  "priority": 2
}
     */

    private String discount_id;
    private String description;
    private String code;

    private boolean active;



    public String getDiscount_id() {
        return discount_id;
    }

    public void setDiscount_id(String discount_id) {
        this.discount_id = discount_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Discounts{" +
                "discount_id='" + discount_id + '\'' +
                ", description='" + description + '\'' +
                ", code='" + code + '\'' +
                ", active=" + active +
                '}';
    }
}
