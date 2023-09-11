package Sept11;

import java.util.ArrayList;
import java.util.LinkedList;

public class Speed {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
        LinkedList<Integer> linkedList = new LinkedList();
        long startTime = System.currentTimeMillis();
        for(int i = 0;i<500000;i++)            arrayList.add((int)(Math.random() * 500000)); //+1 необязателен, конечно
        long finishTime = System.currentTimeMillis();
        System.out.printf("Время заполнения ArrayList: %dms\n",finishTime - startTime);
        for(int i = 0;i<500000;i++)            linkedList.add((int)(Math.random() * 500000));
        startTime = System.currentTimeMillis();
        System.out.printf("Время заполнения LinkedList: %dms\n",- finishTime + startTime);
    }
}
