function UserAccount(account, type, balance, owner) {
    this.accountNumber = account;
    this.accountType = type;
    this.totalBalance = balance;
    this.ownership = owner;
};


const account1 = new UserAccount(5486273622, "Conta Corrente", 27771, "Abigael Natte");
const account2 = new UserAccount(5486273622, "Conta Corrente", 27771, "Abigael Natte");
const account3 = new UserAccount(1183971869, "Conta Poupança", 8675, "Ramon Connell");
const account4 = new UserAccount(9582019689, "Conta Poupança", 862736375, "Jarret Lafuente");
const account5 = new UserAccount(7401971607, "Conta Poupança", 18789, "Jacki Shurmer");
const account6 = new UserAccount(630841470, "Conta Corrente", 28776, "Jobi Mawtus");
const account7 = new UserAccount(4223508636, "Conta Corrente", 2177, "Thomasin Latour");
const account8 = new UserAccount(185979521, "Conta Poupança", 25994, "Lonnie Verheijden");
const account9 = new UserAccount(3151956165, "Conta Corrente", 7601, "Alonso Wannan");
const account10 = new UserAccount(2138105881, "Conta Poupança", 33196, "Bendite Huggett");

console.log(account1.ownership);
console.log(account2.ownership);
console.log(account3.ownership);
console.log(account4.ownership);
console.log(account5.ownership);
console.log(account6.ownership);
console.log(account7.ownership);
console.log(account8.ownership);
console.log(account9.ownership);
console.log(account10.ownership);
