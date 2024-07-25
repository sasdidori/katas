const alphabet = require('../katas/alphabet')
describe('find value of D', () => {
	it.each([
		[[12, 3, 4, 1, 2, 2, 4, 6], 4],
		[[184, 23, 2, 8, 52, 104, 1196, 16], 52],
		[[3, 2, 80, 160, 6, 12, 4, 40], 40],
	])('parameterized test', (input, expected) => {
		const result = alphabet(input)

		expect(result).toBe(expected)
	})
})
