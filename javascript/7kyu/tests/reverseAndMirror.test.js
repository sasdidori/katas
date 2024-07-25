const functions = require('../katas/reverseAndMirror')

test('invert stringcase', () => {
	const result = functions.invert('Hola')
	expect(result).toMatch('hOLA')
})

test('reverse order of strings', () => {
	const result = functions.reverse('Hola')
	expect(result).toMatch('aloH')
})

test('call two other functions and return result', () => {
	const result = functions.reverseAndMirror('Hi', 'HEY')
	expect(result).toMatch('yeh@@@IhhI')
})
