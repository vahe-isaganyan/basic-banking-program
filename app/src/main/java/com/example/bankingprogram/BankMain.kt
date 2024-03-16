package com.example.bankingprogram

fun main() {

    val stanBankAccount = BankAccount("Stan Marsh", 13586.86)
    val sarahBankAccount = BankAccount("Sarah Connor", 0.00)

//Must enter a floating point value
    stanBankAccount.deposit(200.0)
    stanBankAccount.withdraw(150.00)
    stanBankAccount.deposit(2500.31)
    stanBankAccount.withdraw(500.00)

    sarahBankAccount.deposit(100.00)
    sarahBankAccount.withdraw(10.00)
    sarahBankAccount.deposit(300.00)

    stanBankAccount.displayTransactionHistory()
    println("${stanBankAccount.accountHolder}'s balance is $${stanBankAccount.acctBalance()}")

    sarahBankAccount.displayTransactionHistory()
    println("${sarahBankAccount.accountHolder}'s balance is $${sarahBankAccount.acctBalance()}")

}