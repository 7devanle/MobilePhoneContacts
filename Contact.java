package com.company.udemy.arryaLists.MobilePhone;

public class Contact {
    private String contactName;
    private String contactNUmber;

    public Contact() {
        this.contactName = "Ridwan Abdulfatah Omobolanle";
        this.contactNUmber = "08063211050";
    }

    public Contact(String contactName, String contactNUmber) {
        this.contactName = contactName;
        this.contactNUmber = contactNUmber;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactNUmber() {
        return contactNUmber;
    }

    public void setContactNUmber(String contactNUmber) {
        this.contactNUmber = contactNUmber;
    }
}
