package org.example;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GenericClass<T> {
    private T content;

   // public GenericClass(T genericClass) {
   // }

    public void printContent(T content) {
        System.out.println(content.getClass().getName());
    }
}
