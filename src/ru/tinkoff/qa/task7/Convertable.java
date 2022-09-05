package ru.tinkoff.qa.task7;

public interface Convertable {
    public double convert(int a);
}

class CalvinConventer implements Convertable {
    @Override
    public double convert(int a) {
        return a + 273;
    }
}

class FarengeytConventer implements Convertable {

    @Override
    public double convert(int a) {
        return (a - 32) * 5 / 9;
    }
}
