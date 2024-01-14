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
