package co.edu.uptc.Runner;

import co.edu.uptc.controller.MessageController;

public class Runner {
    public static void main(String[] args) {
        MessageController controller = new MessageController();
        controller.getPersons();
        System.out.println("--------------------------------------------");
        controller.orderByName();
        System.out.println("--------------------------------");
        controller.orderByLastName();
    }
}
