package domain;

public class ManagerPost {
    private int ownerId;//идентификатор пользователя или сообщества.
    private String domain;//короткий адрес пользователя или сообщества
    private String query;//поисковой запрос. Для точного результата запрос необходимо передавать в двойных кавычках.
    private boolean ownersOnly;//1 — возвращать только записи от имени владельца стены.Флаг, может принимать значения 1 или 0
    private int count = 20;//количество записей, которые необходимо вернуть.положительное число, по умолчанию 20, максимальное значение 100
    private int offset;//смещение, необходимо для получения определенного подмножества результатов.положительное число, по умолчанию 0
    private boolean extended;//1 — в ответе будут возвращены дополнительные поля profiles и groups, содержащие информацию о пользователях и сообществах. По умолчанию: 0.флаг, может принимать значения 1 или 0

    private PostSourceInfo[] postSourceInfo;
    public PostSourceInfo postSourceInfo(){
        //TODO: add logic
        return null;
    }
    private CopyrightInfo[] copyrightInfo;
    public CopyrightInfo copyrightInfo(){
        //TODO: add logic
        return null;
    }
    private LikesInfo[] likesInfo;
    public LikesInfo likesInfo(){
        //TODO: add logic
        return null;
    }
    private CommentsInfo[] commentsInfo;
    public CommentsInfo commentsInfo(){
        //TODO: add logic
        return null;
    }
    private RepostsInfo[] repostsInfo;
    public RepostsInfo repostsInfo(){
        //TODO: add logic
        return null;
    }
    private ViewsInfo[] viewsInfo;
    public ViewsInfo viewsInfo(){
        //TODO: add logic
        return null;
    }
    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public boolean isOwnersOnly() {
        return ownersOnly;
    }

    public void setOwnersOnly(boolean ownersOnly) {
        this.ownersOnly = ownersOnly;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public boolean isExtended() {
        return extended;
    }

    public void setExtended(boolean extended) {
        this.extended = extended;
    }
}
