import hu.szit.Client;

public class DataService {
    String url;
    Client client;

    public DataService() {
        url = "https://jsonplaceholder.typicode.com/todos";
        client = new Client();
    }

    public String getToDo() {
        return client.get(url);

    }
   
}
