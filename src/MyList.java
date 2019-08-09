import java.util.Arrays;

public class MyList<E> {
    private int size;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        this.elements = new Object[this.DEFAULT_CAPACITY];
    }

    private void ensureCapa() {
        int newSize = this.elements.length * 2;
        this.elements = Arrays.copyOf(this.elements, newSize);
    }

    public void add(E e){
        if (this.size == this.elements.length) {
            this.ensureCapa();
        }
        this.elements[this.size++] = e;
    }

    public E get(int index){
        if(index < 0 || index >= this.size){
            System.out.println("Vị trí phần tử không hợp lệ ");
        }
        return (E) this.elements[index];
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}