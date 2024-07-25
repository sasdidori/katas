function sortMyString(string) {
	const newString = string.slice()
	let odd = ''
	let even = ''
	for (let i = 0; i <= newString.length - 1; i++) {
		i % 2 == 0 ? (even += newString[i]) : (odd += newString[i])
	}
	const oddResult = odd.replace(/ /g, '')
	const evenResult = even.replace(/ /g, '')
	const result = evenResult + ' ' + oddResult
	return result
}
const log = sortMyString('codewars')

module.exports = sortMyString
