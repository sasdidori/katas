const matrix = require('../katas/two_dimensional')

describe("matrix", () => {
    it.each ([
        [[[0, 0], [0, 0]], [[1, 0], [0, 1]]],
        [[[1, 1], [1, 1]], [[1, 1], [1, 1]]],
        [[[-2, -1, -3], [-8, -7, -10], [-2, -5, -7]], [[0, -1, -3], [-8, 0, -10], [-2, -5, 0]]],
        [[[5, 4, 3], [3, 2, 10], [8, 1, 9]], [[1, 4, 3], [3, 1, 10], [8, 1, 1]]],
        [[[-3, 2, 4, 8], [4, 5, 6, 7], [8, 1, 3, 2], [-1, 0, -1, -1]], [[0, 2, 4, 8], [4, 1, 6, 7], [8, 1, 1, 2], [-1, 0, -1, 0]]],
    ])
    ("parameterized test", (input, expected) => {
        const result = matrix(input)
        expect(result).toStrictEqual(expected)
    })
})
