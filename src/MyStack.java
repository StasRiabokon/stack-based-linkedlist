import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyStack {

    private LinkedList<Object> list;
    private int numbElem;

    public MyStack() {
        list = new LinkedList<>();
        numbElem = 0;
    }

    public Object push(Object object) {
        list.add(object);
        numbElem++;
        return object;
    }

    public boolean empty() {
        return list.size() == 0;
    }

    public Object peek() {
        if (list.size() == 0) {
            throw new EmptyStackException();
        }
        return list.get(numbElem - 1);
    }

    public Object pop() {
        if (list.size() == 0) {
            throw new EmptyStackException();
        }
        Object obj = peek();
        list.remove(numbElem - 1);
        numbElem--;
        return obj;
    }

    public void printStack() {
        if (list.size() == 0) {
            throw new EmptyStackException();
        }
        for (Object el : list) {
            System.out.println(el);
        }
    }

    public int search(Object o) {
        int i = lastIndexOf(o, numbElem - 1);

        if (i >= 0) {
            return list.size() - i;
        }
        return -1;
    }

    public int lastIndexOf(Object o, int index) {
        if (index >= numbElem)
            throw new IndexOutOfBoundsException();
        if (o == null) {
            for (int i = index; i >= 0; i--)
                if (list.get(i) == null)
                    return i + 1;
        } else {
            for (int i = index; i >= 0; i--)
                if (o.equals(list.get(i)))
                    return i + 1;
        }
        return -1;
    }

}
