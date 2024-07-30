function findYear(month, dayOfWeek) {
	let year = 2014
	for (let i = year; i <= 2050; i++) {
		const validMonth = month + 1
		const firstDay = new Date(i + '-' + validMonth + '- 1').getDay()
		if (firstDay === dayOfWeek) {
			year = i
			return year
		}
	}
	return 0
}
const log = findYear(11, 2)
console.log(log)
module.exports = findYear
