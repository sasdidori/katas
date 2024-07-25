function simpleFun(input) {
	let biggestDistance = 0
	let distance = 0
	let letter = ''
	for (let i = 0; i <= input.length - 1; i++) {
		let firstIndex = input.indexOf(input[i])
		let lastIndex = input.lastIndexOf(input[i])
		if (lastIndex !== -1) {
			distance = lastIndex - firstIndex + 1
			if (distance > biggestDistance) {
				biggestDistance = distance
				letter = input[i]
			}
		}
	}
	return letter + biggestDistance
}
const log = simpleFun('fffffahhhhhhaaahhhhbhhahhhhabxx')
console.log(log)

module.exports = simpleFun
