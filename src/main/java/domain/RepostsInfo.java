package domain;

public class RepostsInfo {
    private int count; //число пользователей, скопировавших запись;
    private int userReposted; //[0, 1] - наличие репоста от текущего пользователя (1 — есть, 0 — нет);

    public RepostsInfo(int count, int userReposted){
        this.count = count;
        this.userReposted = userReposted;
    }
// Getters, Setters:
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getUserReposted() {
        return userReposted;
    }

    public void setUserReposted(int userReposted) {
        this.userReposted = userReposted;
    }
}
