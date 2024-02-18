// prototype pattern means creating a clone with the properties of the original one

const zombie = {
    eatBrains(){
        return "yummy brain";
    }
}

const chad = Object.create(zombie, { name : { value: 'chad'}});


console.log(chad.eatBrains());
console.log(Object.getPrototypeOf(chad));
