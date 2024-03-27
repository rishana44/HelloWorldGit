package org.example;
class Customer extends Person {
    private String bankAccountNumber;
    public Customer(String firstName, String lastName, String address, String bankAccountNumber) {
        super(firstName, lastName, address);
        this.bankAccountNumber = bankAccountNumber;
    }
    @Override
    public void display() {
        super.display();
        System.out.println("Bank account number: " + this.bankAccountNumber);
    }
}