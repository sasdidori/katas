const findYear = require("../katas/findYear")

test('find the year where first day of month falls on dayOfWeek', () => {
    const result = findYear(11, 2)
    expect(result).toBe(2015)
})

test('find the year where first day of month falls on dayOfWeek', () => {
    const result = findYear(4, 4)
    expect(result).toBe(2014)
})