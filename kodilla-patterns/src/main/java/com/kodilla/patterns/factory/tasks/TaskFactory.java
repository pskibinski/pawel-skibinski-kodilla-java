package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public final static String SHOP = "Shop";
    public final static String PAINT = "Paint";
    public final static String DRIVE = "Drive";

    public Task createTask(final String taskName) {

        switch(taskName) {
            case SHOP:
                return new ShoppingTask("Tesco", "Apples", 10);
            case PAINT:
                return new PaintingTask("Homework", "Red", "Car");
            case DRIVE:
                return new DrivingTask("Trip", "Kraków", "Motorcycle");
            default:
                return null;
        }
    }
}
