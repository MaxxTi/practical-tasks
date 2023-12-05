package com.walking.lesson46_lambda.task1.model;


public final class CarIdenty {
    private final MarkType mark;
    private final int year;
    private final String stateNumber;


    public CarIdenty(MarkType mark, int year, String stateNumber) {
        this.mark = mark;
        this.year = year;
        this.stateNumber = stateNumber;
    }

    public MarkType getMark() {
        return mark;
    }

    public int getYear() {
        return year;
    }

    public String getStateNumber() {
        return stateNumber;
    }

    @Override
    public int hashCode() {
        int result = stateNumber.hashCode();
        result += 31 * year;

        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (!this.getClass().equals(o.getClass())) {
            return false;
        }

        CarIdenty car = (CarIdenty) o;

        return year == car.year && stateNumber.equals(car.stateNumber);
    }
}
