package com.betrybe.bankaccount;


/**
 * AccountNumberFormatter.
 */
public class AccountNumberFormatter {

  /**
   * Formata o número da conta.
   *
   * @param literalAccountNumber número da conta
   */
  public String formatAccountNumber(int literalAccountNumber) {
    String accountAsString = String.format("%s", literalAccountNumber);
    int accountLength = accountAsString.length();
    if (accountLength == 6) return  accountAsString;
    if (accountLength < 6) {
      int leadingZeros = 6 - accountLength;
      String zeros = "";
      for (int n = 1; n <= leadingZeros; n += 1) {
        zeros += "0";
      }
      return zeros + accountAsString;
    }
    int charToRemove = accountLength - 6;
    return  accountAsString.substring(charToRemove);
  }

}
