function cubeChecker(volume, length) {
	if (volume <= 0 || length <= 0) {
		return false
	}
	const width = length
	const height = length
	const result = width * height * length
	const isCuboid = result == volume
	return isCuboid
}
const logResult = cubeChecker(125, 5)
console.log(logResult)
