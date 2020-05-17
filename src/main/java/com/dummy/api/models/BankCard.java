package com.dummy.api.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "BankCards")
@Entity
public class BankCard extends AuditModel {

  private int cvv;
  private int yearOfExpiry;
  private int monthOfExpiry;
  private int pin;
  private long bankCardNumber;
  private String bankCardType;

  @ManyToOne
  private BankUser bankUser;
}
