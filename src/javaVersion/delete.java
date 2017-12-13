package javaVersion;

public class delete {


    public static void main(String[] args) {
        List1 ml = new List1();
        ml.addBack(1);
        ml.addBack(2);
        ml.addBack(3);

        ml.printList();
        System.out.println();

//        ml.delEl(6);
//        ml.delEl(5);
//        ml.delEl(12);
//        ml.delEl(2);
//
//        ml.printList();
//        System.out.println();
    }

}


class ListElement<E> {
    ListElement next;
    E data;
}

class List1<E> {
    private ListElement head;       // указатель на первый элемент
    private ListElement tail;       // указатель последний элемент

    void addFront(E data)           //добавить спереди
    {
        ListElement a = new ListElement();  //создаём новый элемент
        a.data = data;              //инициализируем данные.
        // указатель на следующий элемент автоматически инициализируется как null
        if(head == null)            //если список пуст
        {                           //то указываем ссылки начала и конца на новый элемент
            head = a;               //т.е. список теперь состоит из одного элемента
            tail = a;
        }
        else {
            a.next = head;          //иначе новый элемент теперь ссылается на "бывший" первый
            head = a;               //а указатель на первый элемент теперь ссылается на новый элемент
        }
    }

    void addBack(E data) {           //добавление в конец списка
        ListElement nodeObject = new ListElement();  //создаём новый элемент
        nodeObject.data = data;
        if (tail == null)           //если список пуст
        {                           //то указываем ссылки начала и конца на новый элемент
            head = nodeObject;               //т.е. список теперь состоит из одного элемента
            tail = nodeObject;
        } else {
            tail.next = nodeObject;          //иначе "старый" последний элемент теперь ссылается на новый
            tail = nodeObject;               //а в указатель на последний элемент записываем адрес нового элемента
        }
    }

    void printList()                //печать списка
    {
        ListElement t = head;       //получаем ссылку на первый элемент
        while (t != null)           //пока элемент существуе
        {
            System.out.print(t.data + " "); //печатаем его данные
            t = t.next;                     //и переключаемся на следующий
        }
    }

    void delEl(E data)          //удаление элемента
    {
        if(head == null)        //если список пуст -
            return;             //ничего не делаем

        if (head == tail) {     //если список состоит из одного элемента
            head = null;        //очищаем указатели начала и конца
            tail = null;
            return;             //и выходим
        }

        if (head.data == data) {    //если первый элемент - тот, что нам нужен
            head = head.next;       //переключаем указатель начала на второй элемент
            return;                 //и выходим
        }

        ListElement t = head;       //иначе начинаем искать
        while (t.next != null) {    //пока следующий элемент существует
            if (t.next.data == data) {  //проверяем следующий элемент
                if(tail == t.next)      //если он последний
                {
                    tail = t;           //то переключаем указатель на последний элемент на текущий
                }
                t.next = t.next.next;   //найденный элемент выкидываем
                return;                 //и выходим
            }
            t = t.next;                //иначе ищем дальше
        }
    }
}
