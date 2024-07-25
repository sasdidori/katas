//indexof -> check if indexof not -1 in the string starting from i
const find = 'aabndsab'
const result = find.indexOf('a', 1)
//console.log(result);

for (let i = 0; i <= find.length - 1; i++) {
	let letter = find[i]
	const fj = find.lastIndexOf(letter)
	const fj1 = find.indexOf(letter)
	console.log('index of', letter + ' is ' + fj1)
	console.log('last index of', letter + ' is ' + fj)
	if (find.lastIndexOf(letter) === letter.indexOf) {
		console.log(`the letter ${letter} occurs in the string more than once`)
	}
}

let array = [
	{
		name: 'Dora',
	},
	{
		name: 'Évi',
	},
	{ name: 'Vanda' },
]

let name1 = 'Szandi'

if (array.indexOf(name1) === -1) {
	array.push({ name1: 0 })
} else {
	console.log('bye')
}

//console.log(array);
 
let number = 4
console.log(typeof(operation));

