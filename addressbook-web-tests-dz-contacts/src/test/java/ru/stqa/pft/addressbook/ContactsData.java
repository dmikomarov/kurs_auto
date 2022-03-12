package ru.stqa.pft.addressbook;

public class ContactsData {
  private final String firstname;
  private final String middlename;
  private final String lastname;
  private final String mobile;

  public ContactsData(String firstname, String middlename, String lastname, String mobile) {
    this.firstname = firstname;
    this.middlename = middlename;
    this.lastname = lastname;
    this.mobile = mobile;
  }

  public String getFirstname() {
    return firstname;
  }

  public String getMiddlename() {
    return middlename;
  }

  public String getLastname() {
    return lastname;
  }

  public String getMobile() {
    return mobile;
  }
}
