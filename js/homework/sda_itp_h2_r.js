//### JavaScript Homework2 - Arrays, Loops, Functions
//Using a browser and Dev Tools solve the following tasks.

clear();

// 1. Create an array containing the following numbers: 23, 77, 45, 111, 4, 9, 33, 0, 99, 53, 77, 2, 11, 87, 100. Print the array in the console. 
console.log('#1');
var numbers = [ 23, 77, 45, 111, 4, 9, 33, 0, 99, 53, 77, 2, 11, 87, 100 ];
console.log(`Numbers array: ${JSON.stringify(numbers)}`);

// 2. Print the array size.
console.log('#2');
console.log(`Numbers array size: ${numbers.length}`);

// 3. Print each element of the array on one line.
console.log('#3');
// 3.1 Foor loop
console.log("For loop approach:");
for (var index = 0; index < numbers.length; index++){
    console.log(numbers[index]);
}
// 3.1 forEach
console.log('forEach approach:');
function printNumber(number){
    console.log(number);
}
numbers.forEach(printNumber);

// 4. From the initial array, create an aray of the numbers less than 50.
console.log('#4');
function isLessThan50(number){
    return number < 50;
}
var numbersLessThan50 = numbers.filter(isLessThan50);
console.log(`numbersLessThan50: ${JSON.stringify(numbersLessThan50)}`);

// 5. From the initial array, create an aray of the numbers above than 30.
console.log('#5');
function isAbove30(number){
    return number > 30;
}
var numbersAbove30 = numbers.filter(isAbove30);
console.log(`numbersAbove30: ${JSON.stringify(numbersAbove30)}`);

// 6. From the initial array, create an aray of the numbers between 30 and 50.
console.log('#6');
var numbersFrom30To50 = numbers.filter(isAbove30).filter(isLessThan50);
console.log(`numbersFrom30To50: ${JSON.stringify(numbersFrom30To50)}`);

// 7. From the initial array, create an aray of the even numbers.
console.log('#7');
function isEven(number){
    return number % 2 === 0;
}
var evenNumbers = numbers.filter(isEven);
console.log(`evenNumbers: ${JSON.stringify(evenNumbers)}`);

// 8. From the initial array, create an aray of the odd numbers.
console.log('#8');
function isOdd(number){
    return number % 2 !== 0;
    // return number % 2 === 1;  // same condition as above
}
var oddNumbers = numbers.filter(isOdd);
console.log(`oddNumbers: ${JSON.stringify(oddNumbers)}`);

// 9. Calculate the sum of all elements in the initial array.
console.log('#9');
// 9.1 Foor loop
var sum = 0;
for(var index = 0; index < numbers.length; index++){
    sum = sum + numbers[index];
}
console.log(`Sum [for loop]: ${sum}`);

// 9.2 foorEach
var sum2 = 0;
function addNumberToSum2(number){
    sum2 = sum2 + number;
}
numbers.forEach(addNumberToSum2);
console.log(`Sum [forEach]: ${sum2}`);

// 9.3 reduce
function sumReducer(total, number){
    return total + number;
}
var sum3 = numbers.reduce(sumReducer);
console.log(`Sum [reduce]: ${sum3}`);

// 10. Calculate the sum of odd elements in the initial array.
console.log('#10');
var oddNumbersSum = numbers.filter(isOdd).reduce(sumReducer);
console.log(`oddNumbersSum: ${oddNumbersSum}`);

// 11. Sort the array descending and ascending.
console.log('#11');
numbers.sort();
console.log(`ascendingNumbers: ${JSON.stringify(numbers)}`);

numbers.sort(function(a,b){
    return b - a;
});
console.log(`descendingNumbers: ${JSON.stringify(numbers)}`);
