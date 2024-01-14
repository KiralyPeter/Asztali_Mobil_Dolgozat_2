/*
* File: ToDo.java
* Author: Király Péter
* Copyright: 2023, Király Péter
* Group: Szoft II/1/E
* Date: 2023-01-14
* Github: https://github.com/KiralyPeter/Asztali_Mobil_Dolgozat_2.git
* Licenc: GNU GPL
*/

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
