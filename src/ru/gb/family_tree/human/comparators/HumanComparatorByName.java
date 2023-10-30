package ru.gb.family_tree.human.comparators;

import ru.gb.family_tree.human.Human;
import ru.gb.family_tree.tree.TreeItem;

import java.util.Comparator;

public class HumanComparatorByName <E extends TreeItem> implements Comparator<E> {
    @Override
    public int compare(E o1, E o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
