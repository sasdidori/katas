function matrix(matrix) {
	let copy = JSON.parse(JSON.stringify(matrix))
	for (let i = 0; i <= copy.length - 1; i++) {
		copy[i][i] >= 0 ? (copy[i][i] = 1) : (copy[i][i] = 0)
	}
	return copy
}
const log = matrix([
	[1, 1, -5, 5],
	[2, -4, 11, 2],
	[3, 1, -1, 4],
	[2, -6, 8, 10],
])
console.log(log)

module.exports = matrix
