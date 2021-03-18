package domain;

public class CommentsInfo {
    private int count; //количество комментариев;
    private int canPost; //информация о том, может ли текущий пользователь комментировать запись (1 — может, 0 — не может);
    private int groupsCanPost;// [0, 1] -  информация о том, могут ли сообщества комментировать запись;
    private boolean canClose;// может ли текущий пользователь закрыть комментарии к записи;
    private boolean canOpen; //может ли текущий пользователь открыть комментарии к записи.

    public CommentsInfo(int count, int canPost, int groupsCanPost, boolean canClose, boolean canOpen){
        this.count = count;
        this.canPost = canPost;
        this.groupsCanPost = groupsCanPost;
        this.canClose = canClose;
        this.canOpen = canOpen;
    }
// Getters, Setters:
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCanPost() {
        return canPost;
    }

    public void setCanPost(int canPost) {
        this.canPost = canPost;
    }

    public int getGroupsCanPost() {
        return groupsCanPost;
    }

    public void setGroupsCanPost(int groupsCanPost) {
        this.groupsCanPost = groupsCanPost;
    }

    public boolean isCanClose() {
        return canClose;
    }

    public void setCanClose(boolean canClose) {
        this.canClose = canClose;
    }

    public boolean isCanOpen() {
        return canOpen;
    }

    public void setCanOpen(boolean canOpen) {
        this.canOpen = canOpen;
    }
}
