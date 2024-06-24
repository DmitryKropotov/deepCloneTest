package org.example;

public interface ObjectWithDeepClone {
    default Object deepClone() {
        return this;
    }
}
