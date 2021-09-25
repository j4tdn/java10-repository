let person = {
    name: 'John',
    age: 28,
    skills: 'JAVA, PHP',
    company: {
        id: 'xd15',
        name: 'glb'
    }
}

console.log(person);

function Car(make, model, year) {
    this.make = make;
    this.model = model;
    this.year = year;
}

const car = new Car('Eagle', 'Talon TSi', 1993);
console.log(car);