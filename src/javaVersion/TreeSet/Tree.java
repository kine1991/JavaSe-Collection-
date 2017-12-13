package javaVersion.TreeSet;

import java.util.List;

public interface Tree<E> extends Iterable {
    boolean add(E e);
    List<E> get();
    int size();
    SimpleTree.Leaf find(E e);
}
