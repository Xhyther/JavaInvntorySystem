public class Locker {
    private int id;
    private String UserName;
    private int maximumItemLimit = 100;
    private Items[] items;
    private int ItemCount;

    public Locker(int id, String UserName) {
        this.id = id;
        this.UserName = UserName;
        this.ItemCount = 0;
        this.items = new Items[maximumItemLimit];
    }




}
