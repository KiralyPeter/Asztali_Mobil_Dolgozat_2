public class ToDo {
    int userId;
    int id;
    String title;
    String completed;

    public ToDo(){}

    public ToDo(String title) {
        this.title = title;
    }

    public ToDo(String title, String body) {
        this.title = title;
        this.completed = body;
    }
    public ToDo(int userId, int id, String title, String body) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.completed = body;
    }

}
