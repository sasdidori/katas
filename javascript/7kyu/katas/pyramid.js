function pyramid(floors) {
	if (floors === 0) {
		return '\n'
	}
	let pyramid = ''
	let line
	for (let i = 1; i <= floors; i++) {
		let spaces = ' '.repeat(floors - i)
		let leftSide = '/'
		let rightSide = '\\'
		if (i == floors) {
			line = spaces + leftSide + '_'.repeat(2 * i - 2) + rightSide + '\n'
		} else {
			line = spaces + leftSide + ' '.repeat(2 * i - 2) + rightSide + '\n'
		}
		pyramid += line
	}
	return pyramid
}
const pyramid3 = pyramid(3)
console.log(pyramid3)

module.exports = pyramid
