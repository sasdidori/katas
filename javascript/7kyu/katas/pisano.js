function pisano(n) {
	let pisano = '01'
	let currentNumber = 1
	while (pisano.indexOf('01', 1) == -1) {
		let number = (pisano[currentNumber] + pisano[currentNumber - 1]) % n
		pisano += number
		currentNumber++
	}
	const result = pisano.indexOf('01', 1)
	return result
}
const log = pisano(2)
console.log(log)
