package com.homeworks.homework31;

public class PostOfficeManager {
    public static void main(String[] args) {
        PostOffice office = new PostOffice();
        MailItem one = new Letter("Banderas", "Joli", 0.1, true);
        MailItem two = new Letter("Banderas", "Joli", 0.2, false);
        MailItem three = new Package("Banderas", "Joli", 3.6, 30, 30, 15);
        MailItem visitKarts = new Advertisement("Banderas", "Joli", 0.1, 125);

        office.addMailItem(one);
        office.addMailItem(two);
        office.addMailItem(three);
        office.addMailItem(visitKarts);
        office.printAllDetails();
        office.calculateTotalShippingCost();
    }
}
