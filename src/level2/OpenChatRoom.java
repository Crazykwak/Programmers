package level2;

import java.util.*;

public class OpenChatRoom {

    UserRepo userRepo = new UserRepo();

    public String[] solution(String[] record) {
        List<String> answer = new ArrayList<>();
        for (String s : record) {
            String[] s1 = s.split(" ");
            if(s1.length == 3) {
                User user = new User(s1[1], s1[2]);
                userRepo.save(user);
            }
        }


        for (String s : record) {
            String[] s1 = s.split(" ");

            if(s1[0].equals("Enter")) {
                User user = userRepo.findById(s1[1]);
                answer.add(user.nickName + "님이 들어왔습니다.");
            } else if(s1[0].equals("Leave")) {
                User user = userRepo.findById(s1[1]);
                answer.add(user.nickName + "님이 나갔습니다.");
            }
        }

        return answer.toArray(String[]::new);
    }

    class User {
        String userId;
        String nickName;

        public User(String userId, String nickName) {
            this.userId = userId;
            this.nickName = nickName;
        }
    }

    class UserRepo {

        Map<String, User> store = new HashMap<>();

        void save(User user) {
            store.put(user.userId, user);
        }

        User findById(String userId) {
            return store.get(userId);
        }

        List<User> findAll() {
            List<User> list = new ArrayList<>();
            Set<String> keySet = store.keySet();
            for (String s : keySet) {
                list.add(store.get(s));
            }
            return list;
        }

    }

}
