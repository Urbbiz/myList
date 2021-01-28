package sarasai;

public class MyList {

    private Object[] list;

    public MyList() {
        this.list = new Object[0];
    }

    public void add(Object o) {
        Object[] newList = new Object[this.list.length + 1];
        System.arraycopy(this.list, 0, newList, 0, this.list.length);
//        for (int i = 0; i < list.length; i++) {
//            newList[i] = list[i];
//        }
        newList[newList.length - 1] = o;
        this.list = newList;
    }

    public Object get(int index) {
        if (index < 0 || index >= this.list.length) {
            return null;
        }
        return this.list[index];
    }

    public void set(int index, Object o) {
        if (index < 0 || index >= this.list.length) {
            return;
        }
        this.list[index] = o;
    }

    public void remove(int index) {
        if (index < 0 || index >= this.list.length) {
            return;
        }
        Object[] newList = new Object[this.list.length - 1];
        System.arraycopy(this.list, 0, newList, 0, index);
        System.arraycopy(this.list, index + 1, newList, index, this.list.length - index - 1);
//        for (int i = 0, j = 0; i < list.length; i++) {
//            if (i != index) {
//                newList[j++] = list[i];
//            }
//        }
        this.list = newList;
    }

    public void insert(int index, Object o) {
        if (index < 0 || index >= this.list.length) {
            return;
        }
        Object[] newList = new Object[this.list.length + 1];
        if (index > 0) {
            System.arraycopy(this.list, 0, newList, 0, index - 1);
        }
        newList[index] = o;
        System.arraycopy(this.list, index, newList, index + 1, this.list.length - index);
//        for (int i = 0, j = 0; i < list.length; i++) {
//            if (i == index) {
//                newList[j++] = o;
//            }
//            newList[j++] = list[i];
//        }
        this.list = newList;
    }

    public int size() {
        return this.list.length;
    }

    public String toString() {
        String ret = "[";
        for (int i = 0; i < this.list.length; i++) {
            ret += this.list[i];
            if (i != this.list.length - 1) {
                ret += ", ";
            }
        }
        ret += "]";
        return ret;
    }

    public void printAll() {
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
        System.out.println("--------------");
    }

}
