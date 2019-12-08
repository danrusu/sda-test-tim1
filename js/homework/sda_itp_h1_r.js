/*### JavaScript Homework1 - JSON
Using a browser and Dev Tool, solve the following taks:
1. Create and store in a variable a JSON object that contains the folowing information about a user:
- first name: Mark
- last name: Bronson
- user name: mark.bronson
- user id - 8 digits - 11115793
- is user blocked - boolean - true
- credit card information
    - bank name: ING
    - account nr - 16 digits: 2003 9463 1213 0830
    - available credit: 5211
    - curency: $
*/
clear();

var creditCard  = {
    bankName: "ING",
    accountNr: 2003946312130830,
    availableCredit: 5211,
    curency: "$"
}
var user1 = {
    firstName: "Mark",
    lastName: "Bronson",
    userName: "mark.bronson",
    userId: 11115793,
    isUserBlocked: true,
    creditCard
}

//2. Print the user object in a human readable format (each key-value on a separate line; use indentation).
console.log('#2');
console.log(`user1: ${JSON.stringify(user1, null, 2)}`);

//3. Print the full name of the user.
console.log('#3');
console.log('User full name1: ' + user1.firstName + " " + user1.lastName);
console.log(`User full name2: ${user1.firstName} ${user1.lastName}`);

//4. Print the available credit for the user.
console.log('#4');
console.log(`Available credit for the user: ${user1.creditCard.availableCredit}`);

/*
5. Create 2 more users
user2:
- first name: Adele
- last name: Connor
- user name: adele.connor
- user id - 8 digits - 14115299
- is user blocked - boolean - false
- credit card information
    - bank name: BRD
    - account nr - 16 digits: 2003 9463 1213 0830
    - available credit: 2320
    - curency: $
*/
creditCard2  = {
    bankName: "BRD",
    accountNr: 2003946312130830,
    availableCredit: 2320,
    curency: "$"
}
var user2 = {
    firstName: "Adele",
    lastName: "Connor",
    userName: "adele.connor",
    userId: 14115299,
    isUserBlocked: false,
    creditCard: creditCard2
}
/*
user3:
- first name: Jacob
- last name: Beck
- user name: jacob.beck
- user id - 8 digits - 12585721
- is user blocked - boolean - false
- credit card information
    - bank name: BNR
    - account nr - 16 digits: 2003 9463 1213 0830
    - available credit: 5211
    - curency: $
*/
creditCard3  = {
    bankName: "BNR",
    accountNr: 2003946312130830,
    availableCredit: 5211,
    curency: "$"
}
var user3 = {
    firstName: "Jacob",
    lastName: "Beck",
    userName: "jacob.beck",
    userId: 12585721,
    isUserBlocked: false,
    creditCard: creditCard3
}
 
//6. Create an array of the 3 users.
var bankAccountUsers = [ user1, user2, user3 ];

//7. Print the users array in human readable format.
console.log('#7');
console.log(`Users: ${JSON.stringify(bankAccountUsers, null, 2)}`);

//8. Using the array of users, print on one line the second user bank name, available credit and currency.
console.log('#8');
console.log(bankAccountUsers[1].creditCard.bankName + " " 
    + bankAccountUsers[1].creditCard.availableCredit 
    + bankAccountUsers[1].creditCard.curency);

//9. Using the array of users, print the users full names.
console.log('#9');
function printFullUserName(userObject){
    console.log(`${userObject.firstName} ${userObject.lastName}`);
}
// calls printFullUserName all elements in the array : user1, user2, user3
bankAccountUsers.forEach(printFullUserName); 

//10. Using the array of users, calculate the total available credit for all users.
console.log('#10');
// 10.1 Using a for loop
var sum = 0;
// var bankAccountUsers = [user1, user2, user3];
for(var index = 0; index < bankAccountUsers.length; index++){
    var currentUser = bankAccountUsers[index]
    var credit = currentUser.creditCard.availableCredit;
    console.log(`index ${index} - credit: ${credit}`)
    sum = sum + credit;
}
console.log(`Total credit [for loop]: ${sum}`);

// 10.2 Altrnative - using forEach
sum2 = 0;
function creditSum(user){ 
    sum2 += user.creditCard.availableCredit
}
bankAccountUsers.forEach(creditSum)
console.log(`Total credit [forEach]: ${sum2}`);
