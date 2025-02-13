import java.util.*;

public class Collections {
    private static List<User> userList = new ArrayList<>();
    private static HashMap<String, User> user = new HashMap<>();
    public static void main(String[] args) {
        Collections listInstance = new Collections();
        Collections mapsInstance = new Collections();

        listInstance.toList();
        mapsInstance.toMaps();
    
        for (int i = 0; i <= userList.size() - 1; i++) {
            System.out.println(userList.get(i).name); }
        System.out.println();
        for (String key: user.keySet()) {
            System.out.println(user.get(key).name); }
        }

        public void toList() {
            userList.add(new User("Matt"));
            userList.add(new User("Dominic"));
            userList.add(new User("Peter"));
            }

        public void toMaps() {
            user.put("User 1", new User("Chris"));
            user.put("User 2", new User("John"));
            user.put("User 3", new User("Lewis"));
        }

    public class User {
        String name;
        public User(String name) {
            this.name = name;
        }
    }
}