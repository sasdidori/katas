function findTheTree(trees) {
	const treeOccurences = trees.reduce(
		(acc, currentValue) => ({
			...acc,
			[currentValue]: (acc[currentValue] || 0) + 1,
		}),
		{}
	)
	const values = Object.values(treeOccurences).sort((a, b) => a - b)
	const result = Object.keys(treeOccurences).find(
		(key) => treeOccurences[key] === values[0]
	)
	return parseInt(result)
}
const log = findTheTree([1, 2, 2, 3, 3])
console.log(log)
module.exports = findTheTree
