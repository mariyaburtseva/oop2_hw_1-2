package domain;

public class PostSourceInfo {
    private String type;//тип источника. Возможные значения: vk, widget, api, rss, sms
    private String platform;//название платформы, если оно доступно. Возможные значения: android; iphone; wphone.
    private String date;//тип действия (только для type = vk или widget). Возможные значения: profile_activity — изменение статуса под именем пользователя (для type = vk); profile_photo — изменение профильной фотографии пользователя (для type = vk); comments, like, poll (для type = widget)
    private String url;//URL ресурса, с которого была опубликована запись.

    public PostSourceInfo(String type, String platform, String date, String url){
        this.type = type;
        this.platform = platform;
        this.date = date;
        this.url = url;
    }
    // Getters, Setters:
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
