const sortMyString = require('../katas/oddEvenStringSort')

test('sort characters in string', () => {
	expect(sortMyString('codewars')).toMatch('cdwr oeas')
})
