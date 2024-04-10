package io.codelex.oop.summary;

import java.util.function.Supplier;

public class LazyBox<T> {
    private Supplier<T> supplier; // used supplier because it allows deferring the initialization until it is needed
    private T value;

    public LazyBox(Supplier<T> supplier) {
        this.supplier = supplier;
    }

    public T get() { // if the value is empty, the supplier is called to initialize a value
        if (this.value == null) {
            this.value = supplier.get();
        }
        return value;
    }

    public Supplier<T> getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier<T> supplier) {
        this.supplier = supplier;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}