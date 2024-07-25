const fun = require('../katas/simpleFun')
describe('find the biggest distance between 2 letters', () => {
	it.each([
		['acbdbcda', 'a8'],
		['actdhida', 'a8'],
		['abcdbcda', 'a8'],
		['abcdobka', 'a8'],
		['fffffahhhhhhaaahhhhbhhahhhhabxx', 'a23'],
		['ucabcabcabcdfxhuizfgrsuixacbcx', 'c28'],
	])('parameterized test', (input, expected) => {
		const result = fun(input)

		expect(result).toBe(expected)
	})
})
