package com.ticaret.user.entity;

import com.ticaret.user.annotations.UserEntitySequence;
import com.ticaret.user.constans.UserContstans;
import lombok.Data;


import javax.persistence.*;

@Data
@Entity
@Table(schema = UserContstans.USER_SHEMA_NAME, name = UserContstans.TABLE_NAME,
        indexes = {@Index(columnList = "USER_ID", name = "IDX_USER")
        })
@UserEntitySequence(name = UserContstans.SEQUENCE_NAME)
@MappedSuperclass
public class UserEntity {

    @Id
    @SequenceGenerator(
            name = "USER_ID_SEQUENCE",
            sequenceName = "USER_ID_SEQUENCE"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "USER_ID_SEQUENCE"
    )
    @Column(name = "ID")
    private Long id;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;

    @Column(name = "MAIL")
    private String eMail;

    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
}
