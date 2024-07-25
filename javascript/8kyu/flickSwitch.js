function flickSwitch(array) {
	let result = []
	let toggle = true

	for (let i = 0; i < array.length; i++) {
		if (array.length < 0) {
			return []
		} else if (array[i].includes('flick')) {
			toggle = !toggle
		}
		result.push(toggle)
	}
	return result
}
let array = []

flickSwitch(array)
