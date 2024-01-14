/*
* File: DataService.java
* Author: Király Péter
* Copyright: 2023, Király Péter
* Group: Szoft II/1/E
* Date: 2023-01-14
* Github: https://github.com/KiralyPeter/Asztali_Mobil_Dolgozat_2.git
* Licenc: GNU GPL
*/

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
