package com.walking.lesson46_lambda.task1;

import com.walking.lesson46_lambda.task1.model.Car;
import com.walking.lesson46_lambda.task1.model.ColorType;
import com.walking.lesson46_lambda.task1.model.MarkType;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Реализуйте
 * <a href="https://github.com/KFalcon2022/practical-tasks/tree/master/src/com/walking/lesson38_comparing/task1">Задачу 1 из урока 38</a>
 * описывая компараторы как лямбда-выражения.
 */
public class Main {
    public static void main(String[] args) {
        List<Car> cars = initCars();
        printCar(cars);

        Comparator<Car> numberComp = Comparator.comparing(o -> o.getIdentityCar().getStateNumber());

        cars.sort(numberComp);
        printCar(cars);

        Comparator<Car> colorComp = Comparator.comparing(o -> o.getColor());
        cars.sort(colorComp);
        printCar(cars);

        Comparator<Car> yearComp = Comparator.comparing(o -> o.getIdentityCar().getYear());
        cars.sort(yearComp);
        printCar(cars);

        cars.sort(numberComp.thenComparing(yearComp));
        printCar(cars);
    }

    private static List<Car> initCars() {
        List<Car> cars = new ArrayList<>();

        cars.add(new Car(MarkType.AUDI, ColorType.BLACK, 2001, "674921"));
        cars.add(new Car(MarkType.BMW, ColorType.BLUE, 2002, "674922"));
        cars.add(new Car(MarkType.RENAULT, ColorType.GREEN, 2003, "674923"));
        cars.add(new Car(MarkType.LADA, ColorType.RED, 2004, "674924"));
        cars.add(new Car(MarkType.VOLVO, ColorType.GREY, 2005, "674925"));
        cars.add(new Car(MarkType.KIA, ColorType.WHITE, 2006, "674926"));
        cars.add(new Car(MarkType.MAZDA, ColorType.YELOW, 2007, "674927"));
        cars.add(new Car(MarkType.SUZUKI, ColorType.RED, 2008, "674928"));
        cars.add(new Car(MarkType.LADA, ColorType.BLUE, 2009, "674929"));

        return cars;
    }

    public static void printCar(List<Car> cars) {
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
