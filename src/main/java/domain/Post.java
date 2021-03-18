package domain;

public class Post {
    private int id;//идентификатор записи
    private int ownerId;//ID владельца стены, на которой размещена запись
    private int fromId;//ID автора записи (от чьего имени опубликована запись)
    private int createdBy;// ID администратора, который опубликовал запись (возвращается только для сообществ при запросе с ключом доступа администратора). Возвращается в записях, опубликованных менее 24 часов назад.
    private int date;//время публикации записи в формате unixtime(зафиксированные время и дата)
    private String text;//текст записи
    private int replyOwnerId;//ID записи владельца записи, в ответ на которую была оставлена текущая
    private int replyPostId;// ID записи в ответ на которую была оставлена текущая
    private int friendsOnly;//1, если запись была создана с опцией «Только для друзей»
    private String postType;//тип записи, может принимать следующие значения: post, copy, reply, postpone, suggest.
    private int signerId;// ID автора, если запись была опубликована от имени сообщества и подписана пользователем
    private int canPin;//[0, 1] - информация о том, может ли текущий пользователь закрепить запись
    private int canDelete;//[0, 1] - информация о том, может ли текущий пользователь удалить запись
    private int canEdit;//[0, 1] - информация о том, может ли текущий пользователь редактировать запись
    private int isPinned;//1, информация о том, что запись закреплена
    private int markedAsAds;//[0, 1] - информация о том, содержит ли запись отметку "реклама"
    private boolean isFavorite;//true, если объект добавлен в закладки у текущего пользователя.
    private int postponedId;// идентификатор отложенной записи. Это поле возвращается тогда, когда запись стояла на таймере
    private PostSourceInfo postSourceInfo;
    private CopyrightInfo copyrightInfo;
    private LikesInfo likesInfo;
    private CommentsInfo commentsInfo;
    private RepostsInfo repostsInfo;
    private ViewsInfo viewsInfo;
// Getters, Setters:

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public int getFromId() {
        return fromId;
    }

    public void setFromId(int fromId) {
        this.fromId = fromId;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getReplyOwnerId() {
        return replyOwnerId;
    }

    public void setReplyOwnerId(int replyOwnerId) {
        this.replyOwnerId = replyOwnerId;
    }

    public int getReplyPostId() {
        return replyPostId;
    }

    public void setReplyPostId(int replyPostId) {
        this.replyPostId = replyPostId;
    }

    public int getFriendsOnly() {
        return friendsOnly;
    }

    public void setFriendsOnly(int friendsOnly) {
        this.friendsOnly = friendsOnly;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public int getSignerId() {
        return signerId;
    }

    public void setSignerId(int signerId) {
        this.signerId = signerId;
    }

    public int getCanPin() {
        return canPin;
    }

    public void setCanPin(int canPin) {
        this.canPin = canPin;
    }

    public int getCanDelete() {
        return canDelete;
    }

    public void setCanDelete(int canDelete) {
        this.canDelete = canDelete;
    }

    public int getCanEdit() {
        return canEdit;
    }

    public void setCanEdit(int canEdit) {
        this.canEdit = canEdit;
    }

    public int getIsPinned() {
        return isPinned;
    }

    public void setIsPinned(int isPinned) {
        this.isPinned = isPinned;
    }

    public int getMarkedAsAds() {
        return markedAsAds;
    }

    public void setMarkedAsAds(int markedAsAds) {
        this.markedAsAds = markedAsAds;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public int getPostponedId() {
        return postponedId;
    }

    public void setPostponedId(int postponedId) {
        this.postponedId = postponedId;
    }

    public PostSourceInfo getPostSourceInfo() {
        return postSourceInfo;
    }

    public void setPostSourceInfo(PostSourceInfo postSourceInfo) {
        this.postSourceInfo = postSourceInfo;
    }

    public CopyrightInfo getCopyrightInfo() {
        return copyrightInfo;
    }

    public void setCopyrightInfo(CopyrightInfo copyrightInfo) {
        this.copyrightInfo = copyrightInfo;
    }

    public LikesInfo getLikesInfo() {
        return likesInfo;
    }

    public void setLikesInfo(LikesInfo likesInfo) {
        this.likesInfo = likesInfo;
    }

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public RepostsInfo getRepostsInfo() {
        return repostsInfo;
    }

    public void setRepostsInfo(RepostsInfo repostsInfo) {
        this.repostsInfo = repostsInfo;
    }

    public ViewsInfo getViewsInfo() {
        return viewsInfo;
    }

    public void setViewsInfo(ViewsInfo viewsInfo) {
        this.viewsInfo = viewsInfo;
    }
}

