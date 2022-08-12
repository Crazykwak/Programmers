package backjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhatIsRec {

    static String underBar = "____";
    static StringBuilder sb6 = new StringBuilder("\"재귀함수는 자기 자신을 호출하는 함수라네\"\n");


    public void solution() throws IOException {

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int n = Integer.parseInt(br.readLine());
        int n = 2;

         StringBuilder sb1 = new StringBuilder("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.\n");
         StringBuilder sb2 = new StringBuilder("\"재귀함수가 뭔가요?\"\n");
         StringBuilder sb3 = new StringBuilder("\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.\n");
         StringBuilder sb4 = new StringBuilder("마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.\n");
         StringBuilder sb5 = new StringBuilder("그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"\n");
         StringBuilder sb7 = new StringBuilder("라고 답변하였지.\n");



        System.out.print(sb1);
        say(sb2, sb3, sb4, sb5);
        rec(n, 1, sb2, sb3, sb4, sb5, sb7);
        sb7.delete(0, 4);
        System.out.print(sb7);

    }

    private static void say(StringBuilder sb2, StringBuilder sb3, StringBuilder sb4, StringBuilder sb5) {
        System.out.print(sb2);
        System.out.print(sb3);
        System.out.print(sb4);
        System.out.print(sb5);
    }

    private static void rec(int n, int i, StringBuilder sb2, StringBuilder sb3, StringBuilder sb4, StringBuilder sb5, StringBuilder sb7) {
        if (n == i) {
            sb2.insert(0, underBar);
            sb6.insert(0, underBar);
            sb7.insert(0, underBar);
            System.out.print(sb2);
            System.out.print(sb6);
            System.out.print(sb7);
            return;
        }
        sb2.insert(0, underBar);
        sb3.insert(0, underBar);
        sb4.insert(0, underBar);
        sb5.insert(0, underBar);
        sb6.insert(0, underBar);
        sb7.insert(0, underBar);
        say(sb2, sb3, sb4, sb5);
        rec(n, i+1, sb2, sb3, sb4, sb5, sb7);
        sb7.delete(0,4);
        System.out.print(sb7);
    }
}
