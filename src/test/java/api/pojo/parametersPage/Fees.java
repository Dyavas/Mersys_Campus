package api.pojo.parametersPage;

import org.bouncycastle.cms.PasswordRecipientId;

public class Fees {

    /*
    {
        "id": null,
            "name": "ret345",
            "translateName": [],
        "code": "ftre",
            "priority": 45,
            "active": true,
            "budgetAccountIntegrationCode": "34"
    }*/

    private String name;
    private  String code;
    private  String priority;
    private boolean active;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Fees{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", priority='" + priority + '\'' +
                ", active=" + active +
                '}';
    }
}
