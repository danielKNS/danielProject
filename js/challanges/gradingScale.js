const numbers = []
for (let number = 0; number <= 100; number++) {
    numbers.push(number)
}
console.log('numbers: ', numbers)

const grades = []

numbers.forEach(number => {
    if (number < 60) {
        grades.push([number, "F"])
    } else if (number >=60 && number < 70) {
        grades.push([number, "D"])
    }
})

console.log("grades: ", grades)

const newGrades = numbers.map(number => {
    if (number < 60) {
        return [number, "F"]
    } else if (number >=60 && number < 70) {
        return [number, "D"]
    } else {
        return [number, "not a F or D"]
    }
})
console.log("newGrades: ", newGrades)