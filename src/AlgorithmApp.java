import practice.Item;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlgorithmApp {
    public static void main(String[] args) {
        //test 하는 곳

        System.out.println("-------여기부터 첫번째 생성자--------");
        Item item2 = new Item();
        System.out.println("---------여기까지 첫번째 생성자---------");
        System.out.println("------------------------------------------------------");
        System.out.println("-----------여기브타 두번째 생성자---------");
        Item item1 = new Item("아이템1", 1000,10);
        System.out.println("----------여기까지 두번째 생성자---------");

        item1.introduce();
        System.out.println("-------");
        item1.introduce("잘부탁다립니다.");
        item1.setItemName("바뀐아이템이름");
        System.out.println();
        System.out.println("item1.getItemName() = " + item1.getItemName());
    }
}
