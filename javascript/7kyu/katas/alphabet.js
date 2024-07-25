function alphabet(numbers) {
	const numbersCopy = structuredClone(numbers)
	let sortedNumbers = numbersCopy.sort((a, b) => a - b)
	const elementX = sortedNumbers[0] * sortedNumbers[1]
	const elementC =
		sortedNumbers[2] === elementX ? sortedNumbers[3] : sortedNumbers[2]
	return sortedNumbers[sortedNumbers.length - 1] / elementC
}
module.exports = alphabet
