package book.Generic;

public class Pair <T,S>{

    private T obj;
    private S obj2;

    public Pair(T obj, S obj2) {
        this.obj = obj;
        this.obj2 = obj2;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public S getObj2() {
        return obj2;
    }

    public void setObj2(S obj2) {
        this.obj2 = obj2;
    }
}
