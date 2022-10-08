import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Mihran Galstyan
 * All rights reserved
 */
public class Main {
    public static void main(final String[] args) {
        List<User> userList = new ArrayList<>();

        userList.add(new User("Eduard", 36));
        userList.add(new User("Bred", 40));
        userList.add(new User("Darek", 11));
        userList.add(new User("Gordon", 59));

        long usersOlder40 = userList.stream()
                .filter((user -> user.getAge() > 40))
                .count();

        boolean allOlder18 = userList.stream()
                .allMatch((user -> user.getAge() > 18));

        boolean anyYounger20 = userList.stream()
                .anyMatch(user -> user.getAge() < 20);

        boolean allUnder60 = userList.stream()
                .noneMatch(user -> user.getAge() > 60);
        List<User> sorted = userList.stream()
                .sorted((o1, o2) -> -Integer.compare(o1.getAge(), o2.getAge()))
                .limit(3)
                .collect(Collectors.toList());

        System.out.println(usersOlder40);
        System.out.println("All over 18?: " + allOlder18);
        System.out.println("Anybody under 20?: " + anyYounger20);
        System.out.println("Anybody 60?: " + allUnder60);

        for (final User oldestUser : sorted) {
            System.out.println(oldestUser.getName() + " " + oldestUser.getAge());
        }

    }
}
