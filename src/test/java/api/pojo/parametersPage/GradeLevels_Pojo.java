package api.pojo.parametersPage;

public class GradeLevels_Pojo {
    private String id;

    private String name;
    private String shortName;

    private  String order;

    public boolean showToAllSchools=true;

    public  boolean active=true;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getName() {
        return name;
    }

    public String getShortName() {
        return shortName;
    }

    @Override
    public String toString() {
        return "GradeLevels{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", shortName='" + shortName + '\'' +
                ", order='" + order + '\'' +
                '}';
    }
}
