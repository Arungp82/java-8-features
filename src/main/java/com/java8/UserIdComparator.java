package com.module1;

import java.util.Comparator;

public class UserIdComparator implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        return o1.getUserId() - o2.getUserId();
    }

}
