const p1 = { name: 'john', age: 20 };
p1.age = 22;
console.log(p1);

p1 = { name: 'lee', age: 25 };

//결과 : { name: 'john', age: 22 }
//       p1 = { name: 'lee', age: 25 };
//          ^
//TypeError: Assignment to constant variable.
