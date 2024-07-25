const findTheTree = require('../katas/findTheTree')

test('find the different tree in the array', () => {
	const result = findTheTree([2, 1, 5, 2, 5])

	expect(result).toBe(1)
})

test('find the different tree in the array', () => {
	const result = findTheTree([6, 2, 6, 8, 8, 6, 2, 8])

	expect(result).toBe(2)
})

test('find the different tree in the array', () => {
	const result = findTheTree([1, 1, 13, 1, 9, 9, 1, 9, 13, 13, 13])

	expect(result).toBe(9)
})

test('find the different tree in the array', () => {
	const result = findTheTree([5, 23, 5, 23, 48])

	expect(result).toBe(48)
})
