import java.util.ArrayList;

public class Main {





    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> second_list = new ArrayList<>();
        String j =new String();

        for(int i = 0; i<10; i++){
            j="строка" +String.valueOf(i)+"!";
            list.add(j)   ;
            System.out.println(list.get(i));
        }
        System.out.println();

        j="новая строка по индексу 1";
        list.add(1,j)   ;
        System.out.println(list.get(1)+"\n");


        j="обновленный девятый элемент- "+list.get(9);

        list.add(9,j)   ;
        System.out.println(list.get(9)+"\n");

        list.remove(2);

        System.out.println("строка5 после удаления третьего элемента находится на "+
                list.indexOf("строка5!")+" позиции_ какая неожиданность><\n");

        for (int i=0; i<5;i++){
            j=list.get(i);
            second_list.add(j);
            System.out.println("элементы нового списка: "+second_list.get(i));
        }
        System.out.println();
        for (int i=0;i< list.size();i++) {
            if (second_list.contains(list.get(i))==false) {

                System.out.println("удалена " + list.get(i));
                list.remove(i);
                i--;


            }
            else System.out.println(list.get(i) +" такой элемент есть");
        }



        System.out.println("общие элементы__");
        list.sort(String::compareTo);
        for(int i=0;i<list.size();i++) {
            System.out.println(list.get(i));
        }



    }


}