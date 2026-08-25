class DynamicArray {
    private int[] myArray;
    private int size;     // number of elements currently in the array
    private int capacity; // total capacity of the array

    public DynamicArray(int capacity) {
        if (capacity <= 0) throw new IllegalArgumentException("Capacity must be > 0");
        this.myArray = new int[capacity];
        this.capacity = capacity;
        this.size = 0;
    }

    public int get(int i) {
        return this.myArray[i];
    }

    public void set(int i, int n) {
        this.myArray[i] = n;
    }

    public void pushback(int n) {
        if (this.size >= capacity) resize();
        this.myArray[this.size] = n;
        this.size++;
    }

    public int popback() {
        if (size == 0) throw new IllegalStateException("Array is empty"); // ✅
        size--;
        return this.myArray[size];
    }

    private void resize() {
        int[] newArray = new int[this.capacity*2];
        for(int i = 0; i < this.size; i++) {
            newArray[i] = this.myArray[i];
        }
        this.myArray = newArray;
        this.capacity = this.capacity * 2;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }
}
