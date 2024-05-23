package com.betrybe.bankaccount;

import  com.betrybe.bankaccount.AccountNumberFormatter;
import java.util.Scanner;
import org.apache.commons.lang3.math.NumberUtils;


/**
 * A class.
 */
public class Application {

  /**
   * A simple get method.
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String accountNumber = scanner.next();
    boolean  isNumber = NumberUtils.isCreatable((accountNumber));
    if (!isNumber) {
      System.out.println("Número da conta inválido!");
      scanner.close();
      return;
    }
    AccountNumberFormatter formatter = new AccountNumberFormatter();
    String number = formatter.formatAccountNumber(Integer.parseInt(accountNumber));
    System.out.println("Número da conta: " + number);
  }

}
