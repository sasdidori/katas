function reverseAndMirror(string1, string2) {
	let word1 = string1.slice()
	let word2 = string2.slice()
	const invertedString1 = invert(word1)
	const invertedString2 = invert(word2)
	const reversedAndInverted1 = reverse(invertedString1)
	const reversedAndInverted2 = reverse(invertedString2)
	const reversedAndMirrored = reverse(reversedAndInverted1)
	const result =
		reversedAndInverted2 + '@@@' + reversedAndInverted1 + reversedAndMirrored
	return result
}

function invert(string) {
	let invertedWord = ''
	let invert
	for (let i = 0; i <= string.length - 1; i++) {
		if (string[i].charCodeAt() > 90) {
			invert = string[i].toUpperCase()
		} else {
			invert = string[i].toLowerCase()
		}
		invertedWord += invert
	}
	return invertedWord
}

function reverse(string) {
	let word = ''
	for (let i = string.length - 1; i >= 0; i--) {
		word += string[i]
	}
	return word
}
module.exports = {
	reverseAndMirror: reverseAndMirror,
	invert: invert,
	reverse: reverse,
}
