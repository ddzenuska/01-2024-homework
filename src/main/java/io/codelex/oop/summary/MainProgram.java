package io.codelex.oop.summary;

public class MainProgram {
    public static void main(String[] args) {
        LazyBox<Integer> box = new LazyBox<>(MainProgram::calculate); // calculate is called if empty and the object is initialized

        Integer contents = box.get();
        System.out.println("Calling get method the first time: " + contents);

        Integer contents2 = box.get();
        System.out.println("The second time: " + contents2);
    }

    private static Integer calculate() {
        return 200;
    }
}
