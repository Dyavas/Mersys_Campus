package api.pojo.parametersPage;

public class Citizenship {

   /* {
        "id": null,
            "name": "mane",
            "shortName": "mn",
            "translateName": []
    } */

    private String id;
    private  String name;
    private String shortName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }
}
