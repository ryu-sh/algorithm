package test.musinsa;

import java.util.*;

public class Algo1 {
    public static void main(String[] args) {
        solution(new String[][]{{"da", "de"},{"fr","de"},{"de","ja"}}, "fr");
//        solution(new String[][]{{"da", "fr"},{"de","da"},{"fr","ja"},{"de","ja"},{"cl","fr"}}, "da");
    }

    private static List<String> solution(String[][] friends, String userId) {
        Map<String, List<String>> friendsMap = new HashMap<>();
        Map<String, Integer> resultMap = new HashMap<>();
        List<String> result = new ArrayList<>();

        for (int i = 0; i < friends.length; i++) {
            List<String> friendList1 = friendsMap.getOrDefault(friends[i][0], new ArrayList<>());
            List<String> friendList2 = friendsMap.getOrDefault(friends[i][1], new ArrayList<>());
            friendList1.add(friends[i][1]);
            friendList2.add(friends[i][0]);
            friendsMap.put(friends[i][0], friendList1);
            friendsMap.put(friends[i][1], friendList2);
        }

        List<String> userFriends = friendsMap.get(userId);
        for (String userFriend : userFriends) {
            List<String> tempMutualFriends = friendsMap.get(userFriend);
            for (String tempMutualFriend : tempMutualFriends) {
                if (!friendsMap.get(tempMutualFriend).contains(userId) && !tempMutualFriend.equals(userId)) {
                    resultMap.put(tempMutualFriend, resultMap.getOrDefault(tempMutualFriend, 0) + 1);
                }
            }
        }

        int max = 0;
        for (String tempResult : resultMap.keySet()) {
            if (max <= resultMap.get(tempResult)) {
                if (max < resultMap.get(tempResult)) {
                    result.clear();
                }
                result.add(tempResult);
                max = resultMap.get(tempResult);
            }
        }
        return result;
    }

}
