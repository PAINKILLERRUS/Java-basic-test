package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ArraysClassTest {
    private ArrClass arraysClass;

    @BeforeEach
    public void setUp() {
        arraysClass = new ArrClass();
    }

    @Test
    @DisplayName("Должен выбросить исключение если массив не содержит единиц")
    public void shouldThrowRuntimeExceptionIfArrayDoesNotContainUnits() {
        int[] arr = {3, 4, 5};
        Assertions.assertThrows(RuntimeException.class, () -> arraysClass.extractedNewArray(arr));
    }

    @Test
    @DisplayName("Проверка на совпадение элементов в массиве")
    public void checkingForMatchingElementsNewArray() {
        int[] actualArray = {1, 2, 1, 2, 2};
        int[] expected = {2, 2};
        Assertions.assertArrayEquals(expected, arraysClass.extractedNewArray(actualArray));
    }

    @Test
    @DisplayName("Проверка на несовпадение элементов в массиве")
    public void checkingForNotMatchingElementsNewArray() {
        int[] actualArray = {1, 2, 1, 2, 3};
        int[] expected = {2, 2};
        Assertions.assertNotEquals(expected, arraysClass.extractedNewArray(actualArray));
    }

    @Test
    @DisplayName("Должен проверить на соответствие массив")
    public void shouldCheckForComplianceArray() {
        int[] array = {1, 2, 1, 2, 2};
        Assertions.assertTrue(arraysClass.checkedArray(array));
    }

    @Test
    @DisplayName("Должен проверить на несоответствие массив")
    public void shouldCheckForNotComplianceArray() {
        int[] array = {3, 5};
        Assertions.assertFalse(arraysClass.checkedArray(array));
    }
}
