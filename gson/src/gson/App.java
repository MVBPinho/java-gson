package gson;

import com.google.gson.Gson;

public class App
{
    public static void main (String[] args)
    {
    	//Criação da instancia a ser utilizada
        User user = new User("Fulano", 21, 1000.00);

        String json = "";

        Gson gson = new Gson();

        json = gson.toJson(user);

        System.out.println(json);

        //Processo inverso
        User userFromJson = gson.fromJson(json, User.class);

        System.out.println(userFromJson.getName());
        System.out.println(userFromJson.getAge());
        System.out.println(userFromJson.getSalary());
    }
}