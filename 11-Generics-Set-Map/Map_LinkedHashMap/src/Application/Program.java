package Application;

import java.util.LinkedHashMap;
import java.util.Map;

public class Program {

    public static void main(String[] args) {

        // LinkedHashMap — velocidade intermediária e elementos na ordem em que são adicionados.
        Map<String, String> cookies = new LinkedHashMap<>();

        cookies.put("username", "Maria Ester Santos");
        cookies.put("email", "mariaester@gmail.com");
        cookies.put("phone", "(79)95847-7458");
        cookies.put("cpf", "587.458.965-78");
        cookies.put("rg", "1.254.785");
        cookies.put("cor", "parda");

        cookies.remove("cor");
        cookies.put("phone", "(81)97747-7008");

        System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
        System.out.println("Phone number: " + cookies.get("phone"));
        System.out.println("Email: " + cookies.get("email"));
        System.out.println("Size: " + cookies.size());

        System.out.println("---------- ALL COOKIES ----------");
        // keySet() - retorna um Set<K>
        for (String key : cookies.keySet()) {
            System.out.println(key + ": " + cookies.get(key));
        }
    }
}
