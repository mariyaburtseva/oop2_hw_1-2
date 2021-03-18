package domain;

public class CopyrightInfo {
    private int id;
    private String link;//ссылка на источник материала
    private String name;
    private String type;

    public CopyrightInfo(int id, String link, String name, String type){
        this.id = id;
        this.link = link;
        this.name = name;
        this.type = type;
    }
// Getters, Setters:
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
