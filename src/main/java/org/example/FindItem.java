package org.example;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Getter
@Setter
public class FindItem<T> {
    //private T content;
    //private List<T> list;

    public static <T> T strFindItem(List<T> liste, T item) {
        Optional<T> find = liste.stream()
                .filter(i -> i.equals(item))
                .findFirst();//.orElse(-1); int hatası
        return find.orElse((T) String.valueOf("-1"));
    }

    public static <T> T intFindItem(List<T> iliste, T iItem) {
        Optional<T> find = iliste.stream()
                .filter(i -> i.equals(iItem))
                .findFirst();//.orElse(-1); int hatası
        return find.orElse((T) Integer.valueOf(-1));
    }
  }

