package com.example.bankingprogram

fun main() {

    val stanBankAccount = BankAccount("Stan Marsh", 13586.86)

//Must enter a floating point value
    stanBankAccount.deposit(200.0)
    stanBankAccount.withdraw(150.00)
    stanBankAccount.deposit(2500.31)
    stanBankAccount.withdraw(500.00)

    stanBankAccount.displayTransactionHistory()
    println("${stanBankAccount.accountHolder}'s balance is $${stanBankAccount.balance}")

}