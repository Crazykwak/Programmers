import level2.*;
import level3.FarAwayNode;
import practice.*;

import java.util.*;


public class AlgorithmApp {
    public static void main(String[] args) {
        //test 하는 곳

        String[] s = {
                "Enter uid1234 Muzi",
                "Enter uid4567 Prodo",
                "Leave uid1234",
                "Enter uid1234 Prodo",
                "Change uid4567 Ryan"};
        OpenChatRoom openChatRoom = new OpenChatRoom();
        String[] solution = openChatRoom.solution(s);
        for (String s1 : solution) {
            System.out.println(s1);
        }

    }
}

