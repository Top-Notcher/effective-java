package com.example.effectivejava.chapter04.item17;

public final class Person {
    private final Address address;  // address가 가진 정보들 까지 final이 아니다.

    public Person(Address address) {
        this.address = address;
    }

    public Address getAddress() {
//        return address;
        Address copyOfAddress = new Address();
        copyOfAddress.setCity(address.getCity());
        copyOfAddress.setZipCode(address.getZipCode());
        copyOfAddress.setStreet(address.getStreet());
        return copyOfAddress;   // Person의 정보가 바뀌지 않게 된다.
    }

    public static void main(String[] args) {
        Address address1 = new Address();
        address1.setCity("Seattle");

        Person person = new Person(address1);
        Address address2 = person.getAddress();
        address2.setCity("redmond");

    }
}
