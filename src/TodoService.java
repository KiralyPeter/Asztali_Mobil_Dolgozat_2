/*
* File: TodoService.java
* Author: Király Péter
* Copyright: 2023, Király Péter
* Group: Szoft II/1/E
* Date: 2023-01-14
* Github: https://github.com/KiralyPeter/Asztali_Mobil_Dolgozat_2.git
* Licenc: GNU GPL
*/

import java.util.ArrayList;
import hu.szit.Convert;

public class TodoService {
    DataService dataService;
    String result;

    public TodoService(){
        dataService = new DataService();
        getTodo();
    }

    public void getTodo(){        

        result = dataService.getToDo();
        // System.out.println(result);

        ArrayList<ToDo> todoList = Convert.toListObject(result, ToDo.class);

        for (ToDo result: todoList){
            System.out.printf("UserID: " + result.userId + "\n");
            System.out.printf("ID: " + result.id + "\n");
            System.out.printf("Title: " + result.title + "\n");
            System.out.printf("Completed: " + result.completed + "\n");
            System.out.println();
        }

    }


}
