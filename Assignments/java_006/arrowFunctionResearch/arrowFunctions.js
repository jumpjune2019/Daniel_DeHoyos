//example of an es5 add function 
function add(num){
	return console.log(num + num) ;
}

add(2);
//end of es5 add function demo

//example of an es6 add arrow function that aims to replicate the es5 add function's functionality 
addArrow = num => console.log(num + num);

addArrow(2);
// end of es6 arrow function example


//Con with using arrow functions as constructor 
//arrow functions cannot be used as constructors or with the 'new' keyword

//var Foo = () => {};

//var foo = new Foo(); 

// this use of an arrow function as a constructor and the use of the 'new' keyword 
// throws a TypeError: Foo is not a constructor at line 19 

//An arrow function cannot contain a line break between its parameters and its arrow. 

//var func =(a, b, c)
//			=> 1; 

var word = "Dingus"; 

var dingFunc = word => console.log("Ya, " + word);

dingFunc(word);