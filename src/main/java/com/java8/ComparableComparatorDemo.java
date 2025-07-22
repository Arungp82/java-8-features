package com.module1;

import java.util.*;

public class ComparableComparatorDemo {
    public static void main(String[] args) {
        List<Player> playerList1 = new ArrayList<Player>();

        playerList1.add(new Player(40, 65, "gfsgasdf"));
        playerList1.add(new Player(33, 87, "iouyoiyo"));
        playerList1.add(new Player(52, 43, "jkhlgliyg"));
        playerList1.add(new Player(435, 35, "oiytiuyriuriy"));
        playerList1.add(new Player(3, 32, "khgkfkdfd"));
        playerList1.add(new Player(4, 23, "sgshgjd"));
        playerList1.add(new Player(1, 45, "adfadsfj"));


        Collections.sort(playerList1);
        System.out.println("After Collections.sort() -> " + playerList1);
        System.out.println("---------------------------------------------");

        List<User> userList = new ArrayList<User>();
        userList.add(new User(35,"adsfad",53));
        userList.add(new User(84,"yeu4t",34));
        userList.add(new User(25,"hfjfhgj",23));
        userList.add(new User(86,"iutiuyi",76));
        userList.add(new User(8699,"betrgwfdg",13));
        userList.add(new User(243,"tyewrtwr",24));
        userList.add(new User(476,"zcvzftwr",56));

        UserIdComparator userIdComparator = new UserIdComparator();
        Collections.sort(userList,userIdComparator);
        System.out.println("After sorting using Comparator of id -> "+userList);


        Comparator<User> byUserNameThenByAge = Comparator.comparing(User::getUserName).thenComparing(User::getAge);
        System.out.println("==========================");
        Collections.sort(userList,byUserNameThenByAge);
        System.out.println("byUserNameThenByAge ----results ::: "+userList);

    }
}
