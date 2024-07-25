const pyramid = require('../katas/pyramid')

test('print pyramid', () => {
	expect(pyramid(4)).toBe('   /\\\n  /  \\\n /    \\\n/______\\\n')
})
